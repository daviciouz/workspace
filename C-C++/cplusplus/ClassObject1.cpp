#include <iostream>

using namespace std;

class SteveClass
{
public:
	void coolthings(){
		cout << "Preaching to Public" << endl;
	}
	
};

int main()
{
	SteveClass SteveObject;
	SteveObject.coolthings();

	return 0;
}