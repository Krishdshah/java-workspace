#include <iostream>
#include <string>   
int main(){
    try {
        throw "error";
    }
    catch (int e) {
        std::cout << "Caught an int: " << e << std::endl;
    } catch (double e) {
        std::cout << "Caught a double: " << e << std::endl;
    } catch (std::string e) {
        std::cout << "Caught a string: " << e << std::endl;
    } catch (...) {
        std::cout << "Caught an unknown type" << std::endl;
    }
}