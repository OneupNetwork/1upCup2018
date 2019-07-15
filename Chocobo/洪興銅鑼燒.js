/**
 * Accepted
 * 31 ms    1000 KB
 * Jul/13/2018 16:41 UTC+8
 */
var line1 = readline().split(" ").map(function(x) { return parseInt(x); });
var line2 = readline().split(" ").map(function(x) { return parseInt(x); });
var line3 = readline().split(" ").map(function(x) { return parseInt(x); });
var x = [500,1000,1500,2000,2500];

var result = 0
for (i = 0; i < 5; i++) {
    var rightNumber = (1 - (line1[i] / 250)) * x[i] - (50 * line2[i]);
    result += Math.max(0.3 * x[i], rightNumber);
}
var plus = line3[0] * 100;
var minus = line3[1] * 50;

result = result + plus - minus;
print(parseInt(result));