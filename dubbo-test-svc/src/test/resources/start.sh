#!/usr/bin/env bash
JAR=`pwd | awk -F'/' '{print $6}'`
echo 'packaged jar name is '$JAR
CUR_DIR=`pwd`
LIB_DIR="$CUR_DIR/../../../target/lib"
cd $LIB_DIR
LIB_DIR=`pwd`
cd './..' 
JAR_DIR=`pwd`
echo $JAR_DIR
CP=$JAR_DIR"/$JAR.jar"
echo 'current jar is '$CP
FILELIST=`ls $LIB_DIR`
#echo $FILELIST
for file in $FILELIST; do
    CP=$CP':'$LIB_DIR\/$file
done
echo 'classpath is '$CP

java -cp $CP com.alibaba.dubbo.container.Main
