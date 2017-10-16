FROM oracle/glassfish:nightly
ENV AUTODEPLOY /glassfish5/glassfish/domains/domain1/autodeploy
ENV WAR RateMyDoctor.war
ENV MODULES /glassfish5/glassfish/domains/domain1/lib
ENV CONFIG /glassfish5/glassfish/domains/domain1/config
COPY postgresql-jdbc.jar $MODULES
COPY domain.xml $CONFIG
COPY target/$WAR $AUTODEPLOY

#FROM jboss/wildfly


#ADD ./target/RateMyDoctor.war ./wildfly/standalone/deployments/

