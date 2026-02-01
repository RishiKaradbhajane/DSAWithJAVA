#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *rchild;
    struct node *lchild;
    int height;
};
struct node *createnode(int data);
struct node *insertnode();
void preorder();
struct node *leftroot();
struct node *rightroot();
int getBalanceFact();
int max();
int main()
{
int x,y;

struct node *root=createnode(12);
int b1=getBalanceFactor(root);
printf("\nbalance facotr of node of data 12 is=%d",b1);
root=insertnode(root,5);
root=insertnode(root,8);
root=insertnode(root,11);
root=insertnode(root,18);
root=insertnode(root,19);
int bf=getBalanceFactor(root);
printf("\nbalance factor of node of data 19 is=%d",bf);
printf("\npreorder traversal is:\n");
preorder(root);
return 0;
}
struct node *createnode(int data)
{
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->lchild=NULL;
    newnode->rchild=NULL;
    return newnode;
}
int max(int a, int b)
{
    return(a>b)?a:b;
}
int height(struct node* root){
    if(root==NULL){
    return 0;
}
return(root->height);
}
struct node *rightroot(struct node *root){
    struct node *x=root->lchild;
    struct node *t2=x->rchild;
    x->rchild=root;
    root->lchild=t2;
    root->height=max(height(root->lchild),height(root->rchild))+1;
    x->height=max(height(x->lchild),height(x->rchild))+1;
    return x;
}
struct node *leftroot(struct node *root){
    struct node *y=root->rchild;
    struct node *t2=y->lchild;
    y->lchild=root;
    root->rchild=t2;
    root->height=max(height(root->lchild),height(root->rchild))+1;
    y->height=max(height(y->lchild),height(y->rchild))+1;
    return y;
}
int getBalanceFactor(struct node *root){
    if(root==NULL){
        return 0;
    }
    return (height(root->lchild)-height(root->rchild));
}
struct node *insertnode(struct node *root,int data){
    if(root==NULL)
    return (createnode(data));
    if(data<root->data)
    root->lchild=insertnode(root->lchild, data);
    else if(data<root->data)
    root->rchild=insertnode(root->rchild,data);
    root->height=1+max(height(root->lchild),height(root->rchild));
    int bf=getBalanceFactor(root);
    if(bf>1 && data<root->lchild->data){
        return rightroot(root);
    }
    if(bf<-1 && data<root->rchild->data){
        root->rchild=rightroot(root->rchild);
        return leftroot(root);
    }
    return root;
}
void preorder(struct node *root)
{
    if(root!=NULL){
        printf("%d",root->data);
        preorder(root->lchild);
        preorder(root->rchild);
    }
}