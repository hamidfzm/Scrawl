#!/bin/sh

if [[ $# -eq 0 ]] ; then
    echo "No inputs provided."
    exit 1
fi

echo "Compile $1.java source code to class..."
javac $2 -d Scrawl/ $1.java
if [[ $? != 0 ]] ; then
    exit 1
fi
echo
echo

echo "Execute $1.class to test its working..."
cd Scrawl/
java $1
cd ../
if [[ $? != 0 ]] ; then
    exit 1
fi
echo
echo

echo "Disassemble $1.class to jasmin source code..."

for f in Scrawl/$1*.class;
do
    java -jar classfileanalyzer.jar $f;
    rm $f;
done;