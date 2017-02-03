#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define FILE_PATH "./Factures.txt"
#define DELIM "#"
#define END "end"

void error(char *msg){
    perror(msg);
    exit(0);
}

void getFact(char* buff, char* code){
    strcpy(buff, "");
    FILE *fp=fopen(FILE_PATH, "r");
    if(fp==NULL){
        strcpy(buff, "-2");
        return;
    }
    while (!feof(fp)) {
        char line[500];
        fgets(line, 500, fp);
        char* tempstr = calloc(strlen(line)+1, sizeof(char));
        strcpy(tempstr, line);
        char *token;
        token=strtok(tempstr, DELIM);
        if(strcmp(token, code)==0){
            strcpy(buff, line);
            return;
        }
    }
    strcpy(buff, "");
    return;
}

int main(int argc, char** argv) {
    int sock, length, fromlen, n;
    struct sockaddr_in server;
    struct sockaddr_in from;
    char buf[1024];
    
    sock=socket(AF_INET, SOCK_DGRAM, 0);
    if(sock<0){
        error("Opening socket");
    }
    
    length=sizeof(server);
    bzero(&server, length);
    server.sin_family=AF_INET;
    server.sin_addr.s_addr=INADDR_ANY;
    server.sin_port=htons(4547);
    
    if(bind(sock, (struct sockaddr *)&server, length)<0){
        error("Binding");
    }
    printf("Server up and ready for connection...\n");
    fromlen=sizeof(struct sockaddr_in);
    
    while(1){
        n=recvfrom(sock, buf, 5000, 0, (struct sockaddr *)&from, &fromlen);
        if(n<0){
            error("recvfrom");
        }
        char allFact[]="AllFact";
        char fact[]="Fact";
        char close[]="close\n";
        if(strcmp(buf, close)==0){
            break;
        }else{
            const char delim[2]="*";
            char *token;
            token=strtok(buf, delim);
            if(strcmp(token, allFact)==0){
                FILE *fp=fopen(FILE_PATH, "r");
                if(fp==NULL){
                    char msg[]="-2";
                    n=sendto(sock, msg, strlen(msg), 0, (struct sockaddr *)&from, fromlen);
                }else{
                    while (!feof(fp)) {
                        char line[500];
                        fgets(line, 500, fp);
                        n=sendto(sock, line, strlen(line), 0, (struct sockaddr *)&from, fromlen);
                        if(n<0){
                            error("sendto");
                        }
                    }
                    n=sendto(sock, END, strlen(END), 0, (struct sockaddr *)&from, fromlen);
                }
            }else if(strcmp(token, fact)==0){
                token=strtok(NULL, delim);
                char msg[10000];
                getFact(msg, token);
                n=sendto(sock, msg, strlen(msg), 0, (struct sockaddr *)&from, fromlen);
                if(n<0){
                    error("sendto");
                }
            }
        }
    }
    close(sock);
}

