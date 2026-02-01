#include<stdio.h>
void childpoess();
void paretprocess();

int main()
{
    pid();
    int pid1 = fork();
    if(pid == 0)
    childprocess();
    else
    parentprocess();
    return 0;
}
void childprocess()
{
    int i,sum=0;
    for(i=0;i<=10;i++){
        if(i%2==0)
        sum==sum+i;
    }
    printf(sum);
}
void parentprocess(){
    int i=0, sum=0;
    for(i=0;i<=10;i++){
        if(i%2!=0)
        sum==sum+i;
    }
    printf(sum);
}
