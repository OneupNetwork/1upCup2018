<?php
    /**
     * Accepted
     * 31 ms    400 KB
     * Jul/13/2018 16:40 UTC+8
     */
    $num = explode(' ', trim(fgets(STDIN)));
    $str = trim(fgets(STDIN));

    $x = 0;
    $y = 0;

    $flag = false;
    for ($i=0;$i<=$num[0]/$num[1];$i++) {
        for ($j=0;$j<=$num[0]/$num[2];$j++) {
            if ($num[1] * $i + $num[2] * $j == $num[0]) {
                $x = $i;
                $y = $j;
                $flag = true;

                break;
            }
        }

        if ($flag == true) {
            break;
        }
    }

    if ($x == 0 && $y == 0) {
        echo '-1' . PHP_EOL;
        exit();
    }
    echo $x+$y.PHP_EOL;

    if ($x == 0) {
        $str = str_split($str, $num[2]);
        foreach ($str as $data) {
            echo $data . PHP_EOL;
        }
    } else if ($y == 0) {
        $str = str_split($str, $num[1]);
        foreach ($str as $data) {
            echo $data . PHP_EOL;
        }
    } else {
        $str1 = str_split($str, $num[1]);
        $str2 = str_split(substr($str, $num[1]*$x), $num[2]);

        for ($i=0;$i<$x;$i++) {
            echo $str1[$i] . PHP_EOL;
        }

        for ($i=0;$i<$y;$i++) {
            echo $str2[$i] . PHP_EOL;
        }
    }