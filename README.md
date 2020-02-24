<b><h3>SpringBoot Microservices Logging -using Kibana,ElasticSearch and Logstash</h3></b>

<b>Introduction</b>
Let us see how to configure and use ELK Stack in other words ElasticSearch Logstash and Kibana for application logging

A major challenge in a distributed system (e.g. a system landscape of microservices) is to understand what is going on and even more importantly – what is going wrong, where and why. In this blog post we will see how we can use the ELK stack (i.e. Elasticsearch, Logstash and Kibana, ) from Elastic to aggregate log events from our microservices

There are lot of tools which can do the magic if used properly used together. One such popular set of tools are Elastic Search, Logstash and Kibana

ELK stack is a great open source stack for log aggregation and analytics

<b>Downloads</b>
https://www.elastic.co/downloads/elasticsearch

https://www.elastic.co/downloads/kibana

https://www.elastic.co/downloads/logstash

<b>Logstash Configuration Document</b>
https://elastic.co/guide/en/logstash/current/configuration.html

<b>What is ELK?</b>
ElasticSearch - is a NoSQL database and distributed search and analytics engine if you look at the benefits easy installation and use a powerful internal search technology (build using Apache Lucene) a restful web interface open source noSQL (schema free json documents)

<b>Logstash</b> - is a log shipping and parsing service in other words its a transportation pipeline used to populate elastic search with data benefits open source tool collects, parse and stores logs for futiure its a log aggregator open source

<b>Kibana</b> - a web interface that connects users wit the elasticSearchDatabase and enables visualization and search options for system operation users benefits open source data visualization you can create graphical representation with logs very easily. even beginners can execute powerful log searches easily

<b>"ELK"</b> is the acronym for three open source projects: Elasticsearch, Logstash, and Kibana.

<p><a target="_blank" rel="noopener noreferrer" href="https://github.com/SujitAnandSharma/springboot-logging/blob/master/LoggingWorkFlow.png"><img src="https://github.com/SujitAnandSharma/springboot-logging/blob/master/LoggingWorkFlow.png" alt="title" style="max-width:100%;"></a></p>

<b><h2>Creating Index</h2></b>
<p><a target="_blank" rel="noopener noreferrer" href="https://github.com/SujitAnandSharma/springboot-logging/blob/master/creatingIndex.PNG"><img src="https://github.com/SujitAnandSharma/springboot-logging/blob/master/creatingIndex.PNG" alt="title" style="max-width:75%;"></a></p>

<b><h2>Index</h2></b>
<p><a target="_blank" rel="noopener noreferrer" href="https://github.com/SujitAnandSharma/springboot-logging/blob/master/Index.PNG"><img src="https://github.com/SujitAnandSharma/springboot-logging/blob/master/Index.PNG" alt="title" style="max-width:75%;"></a></p>

<b><h2>Segregating Logs in Kibana</h2></b>
<p><a target="_blank" rel="noopener noreferrer" href="https://github.com/SujitAnandSharma/springboot-logging/blob/master/logs.PNG"><img src="https://github.com/SujitAnandSharma/springboot-logging/blob/master/logs.PNG" alt="title" style="max-width:75%;"></a></p>
