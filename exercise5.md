# Logging Dokumentation

###Warum werden Logging Bibliotheken verwender?

Beim Entwickeln von Software müssen eine vielzahl von Informationen ausgegeben werden um den Ablauf nachvollziehen zu können.
Besonders beim Testen von Programmabläufen kann es äußerst hilfreich sein eine Logging Bibliothek zu verwenden. Da es eine schöne und übersichtliche Lösung ist.

###Loglevel
- OFF
- FATAL
- ERROR
- WARN
- INFO
- DEBUG
- TRACE
- ALL

Die Loglevel haben alle unterschiedliche Bedeutungen und andere Standardausgaben. Beispielsweise wird ERROR in der Konsole ausgegeben, DEBUG hingegen nur in der Logdatei. 
###Kofigurationsmöglichkeiten

Die Konfiguration erfolgt in der Konfigurationsdatei ("log4j2.xml"). Hier wird der Name und Pfad der Logdatei definiert. 
Weiters kann das Ausgabeformat der Logs definiert werden ...

