#!/bin/bash
for i in $( ls testes/large/* ); do 	
	echo '======================================================'
	echo $i
	echo '======================================================'
	cat $i
	java RunTeste $i
	echo '======================================================'
	echo '======================================================'
	echo ""
	echo ""
done
