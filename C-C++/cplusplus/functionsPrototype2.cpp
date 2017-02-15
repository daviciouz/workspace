#include <iostream>

using namespace std;

void printSmthing();

int main()
{
	printSmthing();
	return 0;
}

void printSmthing(){
	cout << "Using function prototype and maintaining main at the top" << endl;
}