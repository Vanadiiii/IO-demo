#!/bin/sh

echo ""
echo "start dummy reading from input stream"
echo "let's write in stream bytes with delay (200ms)"
echo "and read them in another side"
echo ""

java Printer.java | java DummyReader.java

echo ""
echo "as you see - it's only one byte)"
