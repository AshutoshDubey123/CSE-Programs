#include <stdio.h>
#include <stdlib.h>


struct node {
	int data;
	struct node *prev, *next;
};
struct node *head =NULL ;

void insertAtFront()
{
	int item;
	struct node *temp;         //temp word implies newnode
	temp = (struct node*)malloc(sizeof(struct node));
	printf("\nEnter number to be inserted: ");
	scanf("%d", &item);
	temp->data = item;
	temp->prev = NULL; 

	temp->next = head;
	head = temp;
}


void insertAtEnd()
{
	int item;
	struct node *ptr, *temp; //temp word implies newnode
	temp= (struct node*)malloc(sizeof(struct node));
	printf("\nEnter number to be inserted: ");
	scanf("%d", &item);
	temp->data = item;
	ptr = head;
	if (head == NULL) //no node was present
	{
	 head = temp;
	 temp->prev=ptr;
	 temp->next = NULL;
	}

	else//more than one node present
	{
	while(ptr->next!=NULL)
	 {  
		ptr=ptr->next;
	 }
	
	 ptr->next=temp;
	 temp->prev=ptr;
	 temp->next = NULL;
	}
}


void insertAtPosition()
{
	int item, pos, i = 1;  
	struct node *temp, *newnode;
	newnode = malloc(sizeof(struct node));
	newnode->next = NULL;
	newnode->prev = NULL;

	printf("\nEnter position : ");
	scanf("%d", &pos);

	if (head == NULL)  
		head = newnode;
		newnode->prev = NULL;
		newnode->next = NULL;
	}

	else if (pos == 1) {
	
	insertAtFront();
	}

	// Change links
	else {
	printf("\nEnter number to be inserted: ");
	scanf("%d", &item);
	newnode->data = item;
	temp = head;
		while (i < pos - 1) {
			temp = temp->next;
			i++;
		}
		newnode->next = temp->next;
		newnode->prev = temp;
		temp->next = newnode;
		temp->next->prev = newnode;
	}
}

void deleteFirst()
{
	struct node *temp;
	if (head == NULL)
		printf("\nList is empty\n");
	else {
		temp = head;
		head = head->next;
		if (head != NULL)
			head->prev = NULL;
		free(temp);
	}
}

void deleteEnd()
{
	struct node *temp;
	if (head == NULL)
		printf("\nList is empty\n");
	temp = head;
	while (temp->next != NULL)
		temp = temp->next;
	if (head->next == NULL)
		head = NULL;
	else {
		temp->prev->next = NULL;
		free(temp);
	}
}


void deletePosition()
{
	int pos, i = 1;
	struct node *temp, *position;
	temp = head;

	if (head == NULL)
		printf("\nList is empty\n");

	
	else {
		printf("\nEnter position : ");
		scanf("%d", &pos);

		if (pos == 1) {
			deleteFirst(); 
			if (head != NULL) {
				head->prev = NULL;
			}
			free(position);
			return;
		}

		
		while (i < pos - 1) {
			temp = temp->next;
			i++;
		}
		
		position = temp->next;
		if (position->next != NULL)
			position->next->prev = temp;
		temp->next = position->next;

		
		free(position);
	}
}

void traverse()
{
	// List is empty
	if (head == NULL) {
		printf("\nList is empty\n");
		return;
	}
	struct node *temp;
	temp = head;
	while (temp != NULL) {
		printf("Data = %d\n", temp->data);
		temp = temp->next;
	}
}
int main()
{
	int choice;
	while (1) {

		printf("\n\t1 For insertion at"
			" starting\n");
		printf("\t2 For insertion at"
			" end\n");
		printf("\t3 For insertion at "
			"any position\n");
		printf("\t4 For deletion of "
			"first element\n");
		printf("\t5 For deletion of "
			"last element\n");
		printf("\t6 For deletion of "
			"element at any position\n");
        printf("\t7 To see list\n");
		printf("\t8 To exit\n");
		printf("\nEnter Choice :\n");
		scanf("%d", &choice);

		switch (choice) {
		
		case 1:
			insertAtFront();
			break;
		case 2:
			insertAtEnd();
			break;
		case 3:
			insertAtPosition();
			break;
		case 4:
			deleteFirst();
			break;
		case 5:
			deleteEnd();
			break;
		case 6:
			deletePosition();
			break;
		case 7:
			traverse();
			break;

		case 8:
			exit(1);
			break;
		default:
			printf("Incorrect Choice. Try Again \n");
			continue;
		}
	}
	return 0;
}