import std;
using namespace std;

int main()
{
    // Declare variables for coordinate  of circle 1
    double xc1, yc1, r1;

    // Input the coordinates X in Circle 1
    print("Enter Coordinate X of Circle 1: ");
    cin >> xc1;

    // Input the coordinates Y in Circle 1
    print("Enter Coordinate Y of Circle 1: ");
    cin >> yc1;

    // Radius Circle 1
    print("Enter Radius of Circle 1: ");
    cin >> r1;

    // Declare variables for the coordinates
    double xc2, yc2, r2;

    // Input the coordinates X in Circle 2
    print("Enter Coordinate X of Circle 2: ");
    cin >> xc2;

    // Input the coordinates Y in Circle 2
    print("Enter Coordinate Y of Circle 2: ");
    cin >> yc2;

    // Radius Circle 2
    print("Enter Radius of Circle 2: ");
    cin >> r2;

    // Distance of Two Circles
    double distance = sqrt(pow((xc2 - xc1), 2) - pow((xc2 - xc1), 2));

    if (distance <= (r1 - r2))
    {
        print( "circle2 is inside circle1");
    }
    else if (distance <= (r1 + r2))
    {
        print("circle2 overlaps circle1");
    }

    return 0;
}