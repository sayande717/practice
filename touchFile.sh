#!/bin/bash
# $1 = start digit, $2 = end digit, $3 = extension
i=$1
while [ $i -le $2 ]
do
    touch $i.$3
    i=$((i+1))
done