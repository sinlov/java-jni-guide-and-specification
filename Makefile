.PHONY: test check clean build dist all

TOP_DIR := $(shell pwd)

# ifeq ($(FILE), $(wildcard $(FILE)))
# 	@ echo target file not found
# endif

env:
	java --version
	@gradle -v

include z-gradle-base.mk
include guide/z-gradle.mk

help: helpGradleBase help-guide-gradle
	@echo "more task see makefile!"
