#include <iostream>
#include <string>

using namespace std;

class OseiClass{
public: 
	OseiClass(string z){
		setName(z);
	}

	void setName(string x){
		name = x;
	}

	string getName(){
		return name;
	}

private:
	string name;
	
};

int main()
{
	OseiClass so("African Cup of Nations");
	cout << so.getName() << endl;

	OseiClass so2("This time must be");
	cout << so2.getName() << endl;
	return 0;
}