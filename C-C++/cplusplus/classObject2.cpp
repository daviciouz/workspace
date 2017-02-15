#include <iostream>
#include <string>

using namespace std;

class OseiClass{
public: 
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
	OseiClass so;
	so.setName("Stephen Kofi Osei-Akoto");
	cout << so.getName() << endl;

	return 0;
}