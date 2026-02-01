#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *lchild;
    struct node *rchild;
    int height;
};
struct node *root=NULL;
struct node *create(int);
struct node *insert(struct node*,int);
struct node *delete(struct node*,int);
struct node *search(struct node*,int);
struct node *rotleft(struct node*,int);
struct node *rotright(struct node*,int);
int balance_factor(struct node*);
int height(struct node*);
void inorder(struct node*);
void preorder(struct node*);
void postorder(struct node*);

int main()
{
    int ch,data;
    prinif("1.insert\n2.Delete\n3.Search\n4.Inorder\n5.Preorder\n6.Postorder\n7.exit\n");
    printf("enter your chioce\n");
    scanf("%d",&ch);
    switch(ch)
    {
        case 1:printf("enter the data to be inserted: ");
               scanf("%d",&data);
               root=insert(root,data);
               break;
        case 2:printf("enther the data to be deleted: ");
               scanf("%d", &data);
               root=delete(root,data);
               break;
        case 3:printf("enter the data to be searched: ");
               scanf("%d",&data);
               search(root,data);
               break;
        case 4: printf("");
        




    }

}