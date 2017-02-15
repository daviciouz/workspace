#include <iostream>
using namespace std;

class StepseiClass{
public:
	void farewell(){
		cout << "President Obama poured his heart \n out at his farewell speech in Chicago" << endl;
	}
};

int main()
{
	StepseiClass stepseiObject;
	stepseiObject.farewell();
	return 0;
}