#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *rchild;
    struct node *lchild;
};
struct node *newNode(int data)
{
    struct node* node=(struct node*)malloc(sizeof(struct node));
    node->data=data;
    node->lchild=NULL;
    node->rchild=NULL;
    return(node);
}
void inorder(struct node *in){
    if(in==NULL)
    return;
    inorder(in->lchild);
    printf("%d->",in->data);
    inorder(in->rchild);
}
void preorder(struct node *pre){
    if(pre==NULL)
    return;
    printf("%d->",pre->data);
    preorder(pre->lchild);
    preorder(pre->rchild);
}
void postorder(struct node *post)
{
    if(post==NULL)
    return;
    postorder(post->lchild);
    postorder(post->rchild);
    printf("%d->",post->data);
}
int main(){
    struct node *root=newNode(4);
    root->lchild=newNode(8);
    root->rchild=newNode(12);
    root->lchild->rchild=newNode(16);
    root->lchild->lchild=newNode(20);
    root->rchild->lchild=newNode(24);
    root->rchild->rchild=newNode(28);
    printf("\nInorer traversal of binary treeis:\n");
    inorder(root);B
    printf("\npreorder traversal of binary treeis:\n");
    preorder(root);
    printf("\npostorder traversal of binary treeis:\n");
    postorder(root);
    return 0;
}