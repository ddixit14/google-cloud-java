#!/bin/bash

set -e

GENERATION_DIR=$(dirname -- "$0")


module_list=$(find . -mindepth 2 -maxdepth 2 -name pom.xml | sort --dictionary-order |xargs dirname)

for path in $module_list; do

  cat ${path}/versions.txt | while read LINE; do
    if ! [[ $LINE == *"#"* ]]; then
      echo $LINE >> new-versions.txt
    fi
  done
done

cat new-versions.txt | grep '\S' >> versions.txt
rm new-versions.txt