#include <iostream>

using namespace std;

int addNumbers(int x, int y, int z, int w){
	int answer = x + y + z + w;

	return answer;

}

int main(){
	cout << addNumbers(56,68,68,90) << endls;

	return 0;
}