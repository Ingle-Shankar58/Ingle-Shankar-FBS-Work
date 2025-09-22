#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Dob
{
	int date;
	char month[10];
	int year;
}Dob;

typedef struct player
{
	int Jersey_no;
	char name[50];
	int run;
	int  wickets;
	int matches_played;
	Dob dob;
		
}player;

int playercount=5;
void playerdata(player*);
void displayallplayer(player*);
void addplayer(player*);
void searchplayer(player*);
void removeplayer(player*);
void updateplayerdata(player*);
void displayplayerbyrunorwicket(player*,int);
void birthdayWish(player*);

void main()
{
	int choice;
	player* arr;
	int size;
	int nsize=5;
	printf("Enter Array Size :");
	scanf("%d",&size);
	nsize=nsize+size;
	
	arr=(player*) malloc(nsize * sizeof(player));
    
	
	playerdata(arr);
	while(1){
		printf("\n========================> Enter your choice for Managing player Data <=======================\n\n");
		printf("1) Add Player           2) Remove Player      3) Search Player      4) Update Player Data      5) Display Sorted Players     \n6) Display All Players    7) Birthday Wish    8)Exit   \n\n");
		printf("==>:");
		scanf("%d",&choice);
		switch(choice){
			case 1 :
			if(playercount==nsize){
				int newsize;
				printf("\n=======> Player Array is Full <=======\n");
				printf("\nEnter New Size ==> :");
				scanf("%d",&newsize);
				nsize=nsize+newsize;
				arr=(player*) realloc(arr, nsize* sizeof(player));
			}
			else
			{
				addplayer(arr);
			}
			break;
		case 2 :
				removeplayer(arr);
		break;
		case 3 :
			searchplayer(arr);
		break;
		case 4 :
			updateplayerdata(arr);
		break;
		case 5 :
			displayplayerbyrunorwicket(arr,nsize);
		break;
		case 6 :
			displayallplayer(arr);
		break;
		case 7 :
			birthdayWish(arr);
		break;
		case 8 :
			free(arr);
			printf("----- Thank you, for using the Player Management System. Created by (shankar ingle) -----\n\n");
			exit(0);
			break;
		default :
		printf("----- Please, select valid option to manage players info -----\n");	
	}
  }
		
}

void birthdayWish(player* arr)
{
	printf("\n====> Enter Tooday Date  in (DD-month-YY) <====\n\n");
	int date;
	char month[30];
	int year;
	int flag=0;
	char wish[150];
	
	printf("Enter Date :");
	scanf("%d",&date);
	
	printf("Enter Month :");
	scanf("%s",month);
	
	printf("Enter Year :");
	scanf("%d",&year);
	
	
	for(int i=0;i<playercount;i++){
		if((arr[i].dob.date==date)&&(strcasecmp(arr[i].dob.month,month)==0)&&(arr[i].dob.year==year)){
			printf("\n====> Toodayes Birthday <=====\n");
			printf("\n 1) Tooday is %s birthday \n",arr[i].name);
			printf("\nEnter Birthday Wish for %s :",arr[i].name);
			scanf("%s",wish);
			printf("\n===> Birthad Wish Will be Sed <===\n");
			flag=1;
			break;
		}
	}
	
	if(flag==0){
		printf("\n----- Its no one's Birthday Tooday -----\n");
	}
}

void displayplayerbyrunorwicket(player* arr,int nsize)
{
	player brr[nsize];
	
	for(int i=0;i<playercount;i++){
		
		brr[i]=arr[i];
	}
	while(1){
	
	
	int choice;
		
		
	printf(" 1) Top 3 Runer Enter 1 :  | 2) Top 3 Wicketer Enter 2:  |  3) Lowest 3 wicket Enter 3 :  |  4) Lowest 3 Runer Enter 4 :    \n\n5) Enter for Exit 5: \n");
	printf("===>: ");
	scanf("%d",&choice);
	
	if(choice==1)
	{	
		for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].run<brr[j+1].run){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
	for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
		
	}
	else if(choice==2)
	{
		for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].wickets<brr[j+1].wickets){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
	}	
	else if(choice==3)
	{
	for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].wickets>brr[j+1].wickets){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
	}
	else if(choice==4){
		for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].run>brr[j+1].run){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
	}
	else if(choice==5){
		break;
	}
	else
	printf("\n=====> Envalid Choise Please Enter Valid Choice <=====\n");

	
} 
}//display by to 3 run and wicket end here
void updateplayerdata(player* arr)
{
	int jn,i;
	int flag=0;
	while(1){
	
	printf("Enter a Jersey_no Number :");
	scanf("%d",&jn);
	
	for(i=0;i<playercount;i++){
		if(arr[i].Jersey_no==jn){
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		while(1){
		
		int choice;
		printf("\n1] Update Run 1 :     |    2] Update Matches 2 :    |    3] Update Wickets 3 : \n");
		printf("===>");
		scanf("%d",&choice);
		
		if(choice==1){
			printf("Enter Run: ");
			scanf("%d",&arr[i].run);
			printf("\n===> Update Sucessfully<===\n");
			break;
		}
		else if(choice==2){
			printf("Enter Matches Played: ");
			scanf("%d",&arr[i].matches_played);
			printf("\n===> Update Sucessfully<===\n");
			break;
		}
		else if(choice==3){
			printf("Enter Wicket :");
			scanf("%d",&arr[i].wickets);
			printf("\n===> Update Sucessfully<===\n");
			break;
		}
		else{
		
				printf("\n===> Enter Valid Choice <===\n");
			}
		
	}
		break;
	}
	else 
	printf("\n----> Enter Valid Jersey_no Number <----\n\n");
  }
}//update player end here 

void removeplayer(player* arr)
{
	int jn;
	int flag=0;
	while(1){
	printf("Enter Jersey_no number: ");
	scanf("%d",&jn);
	
	for(int i=0;i<playercount;i++){
		if(arr[i].Jersey_no==jn){
		for(int j=i;j<playercount-1;j++){
			arr[j]=arr[j+1];
			
		
		}
		    flag=1;
			playercount--;
	   }
	}
	
	if(flag!=0){
		printf("\n===> remove player Sucessfully <===\n");
		break;
	}
	else
	printf("\n---> Enter Valid Jersey_no number <---\n");
}
	

	
}//remove player end here


void addplayer(player* arr)
{
	int i,jn;
	while(1){
		int flag=0;
		printf("Enter jersey_no: ");
		scanf("%d",&jn);
		for(i=0;i<playercount;i++){
			if(arr[i].Jersey_no==jn){
				printf("\n===> This jersey_no is allready Exists <===\n");
				printf("\n===> Try Another Jarsey_no <===\n");
				flag=1;
				break;
			}
		}
		if(flag==0){
			arr[i].Jersey_no=jn;
			printf("Enter Name:");
			scanf(" %s",arr[i].name);
			printf("Enter Run: ");
			scanf("%d",&arr[i].run);
			printf("Enter Wickets: ");
			scanf("%d",&arr[i].wickets);
			printf("Enter matches_played: ");
			scanf("%d",&arr[i].matches_played);
			printf("Enter Date of Birth (dd-mm-yy) Date:");
			scanf("%d",&arr[i].dob.date);
			printf("Enter Month: ");
			scanf(" %s",arr[i].dob.month);
			printf("Enter year: ");
			scanf("%d",&arr[i].dob.year);
			printf("\n====> Player Add Sucessfully <====\n");
			playercount++;
			break;
		}
	}
	
}//add end here

void searchplayer(player* arr)
{
	int choice;
	while(1){
	
	printf(" 1] Search By Jersey_no Enter 1:      |   2] Search By Name Enter 2 :   |  3] exit 3 :\n");
	printf("==> ");
	scanf("%d",&choice);
	
	if(choice==1){
		while(1){
		
		int jn;
		printf("Enter Jersey_no: ");
		scanf("%d",&jn);
		int flag=0;
		for(int i=0;i<playercount;i++){
			if(arr[i].Jersey_no==jn){
				printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name: %s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",arr[i].Jersey_no,arr[i].name,arr[i].run,arr[i].wickets,arr[i].matches_played,arr[i].dob.date,arr[i].dob.month,arr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
			flag=1;
			break;
			  }
			
			}
			if(flag==1){
				break;
			}
			
			if(flag==0){
				printf("\n===> Enter Valid Jersey_no <===\n");
				
			
		}	
	} 
}
	else if(choice==2){
		
		while(1){
		
		char name[30];
		printf("Enter Name: ");
		scanf("%s",name);
		int flag=0;
		for(int i=0;i<playercount;i++){
			if(strcasecmp(arr[i].name,name)==0){
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name: %s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",arr[i].Jersey_no,arr[i].name,arr[i].run,arr[i].wickets,arr[i].matches_played,arr[i].dob.date,arr[i].dob.month,arr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
			flag=1;
			break;
			}
			  }
			if(flag==1){
				break;
			}
			if(flag==0){
			printf("\n===> Enter Valid Name <===\n\n");	
		}
		
	  }
	}
	else if(choice==3){
		break;
	}
	else
	printf("\n===>Please Enter Valid Choice :<===\n\n");
	
}
	
}//search player ends here

void displayallplayer(player* arr)
{
	for(int i=0;i<playercount;i++){
		printf("------------------------------------------------------------------------------\n\n");
		printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",arr[i].Jersey_no,arr[i].name,arr[i].run,arr[i].wickets,arr[i].matches_played,arr[i].dob.date,arr[i].dob.month,arr[i].dob.year);
	}
	printf("------------------------------------------------------------------------------\n");
}//display end here

void playerdata(player* arr)
{
	arr[0].Jersey_no=45;
	strcpy(arr[0].name,"Rohit_Sharma");
	arr[0].run=7000;
	arr[0].wickets=15;
	arr[0].matches_played=272;
	arr[0].dob.date=30;
	strcpy(arr[0].dob.month,"april");
	arr[0].dob.year=1987;
	
	arr[1].Jersey_no=18;
	strcpy(arr[1].name,"Virat_kohli");
	arr[1].run=8618;
	arr[1].wickets=4;
	arr[1].matches_played=266;
	arr[1].dob.date=5;
	strcpy(arr[1].dob.month,"nov");
	arr[1].dob.year=1988;
	
	
	arr[2].Jersey_no=33;
	strcpy(arr[2].name,"Suryakumar_Yadav");
	arr[2].run=6500;
	arr[2].wickets=10;
	arr[2].matches_played=150;
	arr[2].dob.date=14;
	strcpy(arr[2].dob.month,"sept");
	arr[2].dob.year=1990;
	
	arr[3].Jersey_no=32;
	strcpy(arr[3].name,"Ishan_Kishan");
	arr[3].run=4500;
	arr[3].wickets=16;
	arr[3].matches_played=180;
	arr[3].dob.date=18;
	strcpy(arr[3].dob.month,"july");
	arr[3].dob.year=1998;
	
	arr[4].Jersey_no=72;
	strcpy(arr[4].name,"Tilak_Varma");
	arr[4].run=5500;
	arr[4].wickets=17;
	arr[4].matches_played=180;
	arr[4].dob.date=8;
	strcpy(arr[4].dob.month,"nov"); 
	arr[4].dob.year=2002;
}
// the player management code is end here ..... thank you ......





