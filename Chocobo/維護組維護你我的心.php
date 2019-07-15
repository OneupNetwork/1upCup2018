<?php
    /**
     * Accepted
     * 46 ms    400 KB
     * Jul/13/2018 16:58 UTC+8
     */
    $line = trim(fgets(STDIN));
    $m = explode(' ', $line);

    $line = trim(fgets(STDIN));
    $w = explode(' ', $line);

    $line = trim(fgets(STDIN));
    $h = explode(' ', $line);

    $score = array(500,1000,1500,2000,2500);

    $total = 0;
    foreach($score as $k => $s){
        if ($m[$k] !== 0) {
            $mod = $s/250;
            $tmp = (250 - $m[$k])*$mod -50*$w[$k];
            $max = max(0.3*$s, $tmp);
            $total += $max;
        }
    }

    echo $total+100*$h[0]-50*$h[1];