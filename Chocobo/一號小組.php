<?php
    /**
     * Accepted
     * 46 ms    400 KB
     * Jul/13/2018 17:32 UTC+8
     */
    $m = explode(' ', trim(fgets(STDIN)));
    $w = explode(' ', trim(fgets(STDIN)));
    $h = explode(' ', trim(fgets(STDIN)));
    $x = [500, 1000, 1500, 2000, 2500];

    $s = 0;
    for ($i=0;$i<5;$i++) {
        $s1 = $x[$i] * 0.3;
        $s2 = (((1 - $m[$i]/250)*$x[$i]) - 50 * $w[$i]);

        $s = $s + max($s1, $s2);
    }

    $s = $s + ($h[0] * 100) + ($h[1] * -50);

    echo $s . PHP_EOL;