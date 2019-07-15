<?php
/**
 * Accepted
 * 46 ms    400 KB
 * Jul/13/2018 16:42 UTC+8
 */
// moogle

list($n, $p, $q) = explode(" ", trim(fgets(STDIN)));

$originText = trim(fgets(STDIN));

$min = min($p, $q);
$max = max($p, $q);
$answer = [];

while ($n > 0) {


    if ($n == $min) {
        $answer[] = $min;
        $n = 0;
    } elseif ($n % $max == 0) {
        $answer = array_merge($answer, array_fill(0, $n / $max, $max));
        $n = 0;
    } elseif ($n > $min) {
        $answer[] = $min;
        $n -= $min;
    } else {
        echo "-1";
        exit;
    }
}

echo count($answer) . PHP_EOL;
$start = 0;
$answerText = [];
foreach ($answer as $a) {
    $answerText[]=  substr($originText, $start, $a);
    $start += $a;
}

echo implode("\n", $answerText);