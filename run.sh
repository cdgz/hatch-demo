#!/bin/sh

# run project

docker build -t hatch-demo .
docker run -p 8080:8080 hatch-demo
