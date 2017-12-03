#!/usr/bin/env bash
docker rmi $(docker images | grep "none" | awk '{print $3}')

echo "exec shell success "