<?php
    /**
     * Accepted
     * 467 ms   9800 KB
     * Jul/13/2018 17:10 UTC+8
     */
    $numberLength = (int) fgets(STDIN);
    $d =  explode(" ", trim(fgets(STDIN)));
    sort($d,SORT_NUMERIC);


    foreach ($d as $n) {
        $sum = bcadd($sum, $n);
    }


    if (bcmod($sum, 2) == 1) {
        foreach ($d as $n) {
            if ($n % 2 == 1){
                $sum = bcadd($sum, "-{$n}");
                break;
            }
        }
    }

    echo $sum;