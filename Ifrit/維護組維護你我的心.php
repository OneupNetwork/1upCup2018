<?php
    /**
     * Accepted(Practice)
     * 46 ms    400 KB
     * Jul/13/2018 18:06 UTC+8
     */
    list($max_tries, $penalty) = explode(" ", trim(fgets(STDIN)));
    $passAry = [];

    for ($i = 0; $i < $max_tries; $i++) {
        $passAry[] = trim(fgets(STDIN));
    }
    $correctLength = strlen(trim(fgets(STDIN)));

    usort($passAry, function($a, $b) {
        if (strlen($a) >strlen($b)) return 1;
        if (strlen($a) <strlen($b) ) return -1;
        return 0;

    });

    $bestTimes = 0;


    for ($i = 0; $i < count($passAry); $i++) {
        if (strlen($passAry[$i]) === $correctLength) {
            $bestTimes = $i + 1;
            break;
        }
    }

    for (; $i < count($passAry); $i++) {
        if (strlen($passAry[$i]) === $correctLength) {
            $worstTimes = $i + 1;
            continue;
        }
        break;
    }

    printf(
        "%d %d",
        $bestTimes + (ceil($bestTimes / $penalty)-1) * 5,
        $worstTimes + (ceil($worstTimes / $penalty)-1) * 5
    );