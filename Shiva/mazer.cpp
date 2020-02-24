/**
 * Accepted
 * 483 ms	47400 KB
 * Feb/24/2020 12:16 UTC+8
 */

#include <iostream> 
#include <vector>
#include <algorithm>

using namespace std;

int main() {

	int n, m;
	cin >> n >> m;

    struct Point {
        int x;
        int y;
    };

    vector<Point> wallLocation;

    char temp;
	for(int x = 0; x < n; x++) {
        for(int y = 0; y < m; y++) {
            cin >> temp;
            if (temp == '.') continue;
            Point tempPoint;
            tempPoint.x = x;
            tempPoint.y = y;
            wallLocation.push_back(tempPoint);
        }
    }

    if (wallLocation.size() == 0) {
        cout << "YES\n" << 1 << " " << 1 << endl;
        return 0;
    }

    if (any_of(
        wallLocation.begin(), 
        wallLocation.end(), 
        [wallLocation](Point wall) {
            return 
                wall.x > wallLocation.front().x && 
                wall.y > wallLocation.front().y && 
                wall.x < wallLocation.back().x && 
                wall.y < wallLocation.back().y;
        }
    )) {
        cout << "NO\n" << endl; 
        return 0;
    }

    for (Point bombX: wallLocation) {
        for (Point bombY: wallLocation) {
            if (!any_of(
                wallLocation.begin(), 
                wallLocation.end(), 
                [bombX, bombY](Point wall) {
                    return wall.x != bombX.x && wall.y != bombY.y;
                }
            )) {
                cout << "YES\n" << bombX.x + 1 << " " << bombY.y + 1 << endl;
                return 0;
            }
        }
	}

    cout << "NO\n" << endl; 
    return 0;

}
