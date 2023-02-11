#!/bin/sh

echo ""
echo "start good reading from input stream"
echo "let's write in stream bytes with delay (200ms)"
echo "and read them in another side"
echo ""

java Printer.java | java GoodReader.java

echo ""
echo "as you see - it's full of bytes)"
