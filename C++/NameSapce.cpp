#include<iostream>
  

namespace Marvellous    // UserDefined Namespace
{
    class Demo
    {

    }; 
} 

namespace PPA      // UserDefined Namespace
{
    class Hello
    {

    };  
}   

using namespace Marvellous;
using namespace PPA;

int main()
{
    
    std::cout<<"Inside Main\n";
    Demo dobj;
    Hello hobj;

    return 0;
}