#include<stdio.h>
#include<stdbool.h>
bool check;
#define MAX 6
struct emp{
    int  emp_id;
    int emp_sal;
    int name[50];
};
void binarySearch(struct emp e[],int a,int key){
    int mid, left=0, right=MAX-1, c=0;
    while(left<=right){
        mid=(left+right)/2;
        c++;
        if(e[mid].emp_id==key)
        {
            printf("Employee id:%d\n",e[mid].emp_id);
            printf("Empployee name :%s\n", e[mid].name);
            printf("employeesalary:%d\n", e[mid].emp_sal);
            check=true;
            break;
        }
        if(e[mid].emp_id<key)
        left=mid+1;
        else 
        right==mid-1;
        }
        printf("Number of comparison is %d\n",c);
}
int main()
{
    int n;
    printf("enter no. of employee:");
    scanf("%d",&n);
    struct emp e[n];

    for(int i=0; i<n; i++){
        printf("enter the employee name");
        scanf("%s", e[i].name);
        printf("Enter %s id:",e[i].name);
        scanf("%d", &e[i].emp_id);
        printf("enter %s salary: ", e[i].name);
        scanf("%d",&e[i].emp_sal);
    }
    int key;
    printf("enter employee id which is to be searched :");
    scanf("%d",&key);
    binarySearch(e, n, key);

    if(check == false)
    printf("employee not found");
    return 0;
}