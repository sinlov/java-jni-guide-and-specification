guideGradleName ?= guide

guideTasks:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):tasks

guideTasksAll:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):tasks --all

guideClean:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):clean

guideDependencies:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):dependencies

guideDependDefault:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):dependencies --configuration default

guideDependCompileClasspath:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):dependencies --configuration compileClasspath

guideDependentComponents:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):dependentComponents

guideTest:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):test

guideTestInfo: guideClean
	@${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):test --info

guideJacocoTestReport:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):jacocoTestReport

guidePiTest:
	${ENV_GRADLE_WRAPPER_EXEC} :$(guideGradleName):pitest

help-guide-gradle:
	@echo "=> $(guideGradleName)/z-gradle.mk : gradle $(guideGradleName) task"
	@echo "make guideTasks                  -> show task of $(guideGradleName)"
	@echo "make guideTasksAll               -> show all task of $(guideGradleName)"
	@echo "make guideDependencies           -> $(guideGradleName) full dependencies"
	@echo "make guideDependDefault          -> $(guideGradleName) dependencies of default"
	@echo "make guideDependCompileClasspath -> $(guideGradleName) dependencies of compileClasspath"
	@echo "make guideDependentComponents    -> $(guideGradleName) dependentComponents"
	@echo "make guideClean                  -> $(guideGradleName) clean"
	@echo "make guideTest                   -> $(guideGradleName) test case"
	@echo "make guideJacocoTestReport       -> $(guideGradleName) test jacocoTestReport"
	@echo "make guidePiTest                 -> $(guideGradleName) pitest"
	@echo ""