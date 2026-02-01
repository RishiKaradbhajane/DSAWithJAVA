#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *right,*left;

};
struct node *root=NULL;
struct node *creat(int val)
{
    struct node *nnode=(struct node*)malloc(sizeof(struct node));
    nnode->data=val;
    nnode->right=NULL;
    nnode->left=NULL;
    return nnode;
}
void insert()
{
    struct node *nnode,*temp,*prev;
    nnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter the value: ");
    scanf("%d",&nnode->data);
    temp=root;
    while(temp!=NULL)
    {
        prev=temp;
        if(nnode->data>temp->data)
        {
            temp=temp->right;
        }
        else
        {
            temp=temp->left;
        }
    }
    if(prev->data<nnode->data)
    {
            prev->right=nnode;
      }
      else{
        prev->left=nnode;
      }
}
void min()
{
while(root!=NULL){
    
    root=root->left;
}
    printf("the smallest is %d: ",root->data);

}
void max(){
    
    while(root!=NULL && root->right!=NULL){
        root=root->right;
    }
        printf("the largest number is: %d",root->data);
    
}
void delete(){
    int key;
    printf("enter the node to be deleted\n");
    scanf("%d",&key);
    if(root==NULL)
    printf("ELEMENT IS NOT PRESENT");
    else if(key<root->data){
    


    }
}
int search(struct node *root, int key){
if(root==NULL){
    printf("element is not found ");
}
while(root!=NULL){
 if(key<root->data){
    root=root->left;
 
}
else{
    root=root->right;

 }
}
}
 void main()
{
    int choice;
    root=creat(10);
    root->left=creat(6);
    root->right=creat(11);
    abc: printf("1.insert an element in BST\n2.maximum element in BST\n3.Minimum element in BST\n4.Delete an element From BST\n5.search an element\nenter the choice: ");
    scanf("%d",&choice);

    switch(choice)
    {
        case 1:
        {
            insert();
            break;
        }
        case 2:
        {
            max();
            break;
        }
        case 3:
        {
            min();
            break;
        }
        case 4:
        {
            delete();
            break;
        } 
        case 5:
        {
            int key;
            printf("enter the element to be sesrched ");
            scanf("%d", &key);
            search(root,key);
        }    
    }

    int x;
    printf("do you want to continue if yes then press 1\n");
    scanf("%d",&x);
    if(x==1)
        goto abc;
}
