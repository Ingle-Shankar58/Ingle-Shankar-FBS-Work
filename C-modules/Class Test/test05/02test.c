//Q2 wap to initialize some amount in your account . then give choice to user to use for deposit
//or withdrow and display updated amount . condition to withdrow (if the balamce is less than 3000
//display cant withdraw the amount balance is not sufficient .)
#include<stdio.h>
void bank(double,double,char);
void main() 
{
	printf("----->welcome to HDFC bank<-----\n");
	double balance=5000,amount;
	printf("drear customer your account balance is:%lf\n",balance);
	char choice;
	printf("enter a choice for deposit:(d) or for withdrow:(w) :");
	scanf(" %c",&choice);
	
	bank(balance,amount,choice);
}
// start
void bank(double balance,double amount,char choice)
 {


	if(choice=='d') {

		printf("enter a amount for deposit :");
		scanf("%lf",&amount);
		if(amount>0) {
			balance=balance+amount;
			printf("Congratulations your Ac is credited by:%lf and current balance is:%lf",amount,balance);
		} else {
			printf("invalid amount please fill the amount is grager than zero (0)");
		}

	} else {
		if(choice=='w') {


			printf("enter a withdraw amount :");
			scanf("%lf",&amount);
			if(balance <=3000) {
				printf("Sorry dear customer your AC balance is not sufficient for withdraw money  banance is less than 3000");
				return;
			} else {
				if(amount>balance) {
					printf("insufficient fund");
					return ;
				} else {
					if(amount<=0) {
						printf("invalid amount");
						return;
					}
				}
			}
			balance=balance-amount;
			printf("dear customer %lf is withdraw from your AC and current balance is :%lf",amount,balance);
		} else {
			printf("invalid choice");
		}

	}


}