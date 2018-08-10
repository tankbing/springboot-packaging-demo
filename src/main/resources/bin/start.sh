ENV=$1
if [ "$ENV" == "" ]
then
    ENV="dev";
fi

java -Xms256m -Xmx512m -server -Dspring.config.location=../config/application.properties,../config/messages_en.properties,../config/env/%ENV%/env-config.properties -jar ../lib/packaging-demo.jar