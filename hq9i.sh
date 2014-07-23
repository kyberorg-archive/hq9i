#!/bin/bash
JAR_NAME=hq9-interpreter
RELEASE_DIR=out
if [ -d ${RELEASE_DIR} ]; then
    cd ${RELEASE_DIR}
    if [ -f ${JAR_NAME}.jar ];then
        java -jar ${JAR_NAME}.jar
    else
        echo "Unable to locate JAR file. Did your build was successful?"
        exit 1
    fi
else
    echo "`pwd`/${RELEASE_DIR} not exists. Did you run 'mvn clean package' before?"
    exit 1
fi


