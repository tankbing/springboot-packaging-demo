set ENV=%1
IF [%1]==[] (
set ENV=dev
)
echo %ENV%
java -Xms256m -Xmx512m -server -Dspring.config.location=../config/application.properties,../config/messages_en.properties,../config/env/%ENV%/env-config.properties -jar ../lib/packaging-demo.jar