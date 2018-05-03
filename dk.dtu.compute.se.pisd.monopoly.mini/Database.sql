CREATE DATABASE  IF NOT EXISTS `Monopoly1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `Monopoly1`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: Monopoly1
-- ------------------------------------------------------
-- Server version	5.6.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Bil`
--

DROP TABLE IF EXISTS `Bil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bil` (
  `Bil_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Farve` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Bil_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bil`
--

LOCK TABLES `Bil` WRITE;
/*!40000 ALTER TABLE `Bil` DISABLE KEYS */;
INSERT INTO `Bil` VALUES (1,'Blå'),(2,'grøn'),(3,'rød'),(4,'gul'),(5,'sort'),(6,'lilla');
/*!40000 ALTER TABLE `Bil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ejendom`
--

DROP TABLE IF EXISTS `Ejendom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ejendom` (
  `Ejendom_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Ejendom_Værdi` int(11) DEFAULT NULL,
  `Antal_Huse` int(11) DEFAULT NULL,
  `Ejer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Ejendom_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ejendom`
--

LOCK TABLES `Ejendom` WRITE;
/*!40000 ALTER TABLE `Ejendom` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ejendom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Spil`
--

DROP TABLE IF EXISTS `Spil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Spil` (
  `Spil_ID` int(11) NOT NULL,
  PRIMARY KEY (`Spil_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Spil`
--

LOCK TABLES `Spil` WRITE;
/*!40000 ALTER TABLE `Spil` DISABLE KEYS */;
/*!40000 ALTER TABLE `Spil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Spiller`
--

DROP TABLE IF EXISTS `Spiller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Spiller` (
  `Spiller_ID` int(11) NOT NULL,
  `Spiller_placering` int(11) NOT NULL,
  `Frikort` tinyint(1) NOT NULL,
  `Runde` int(11) NOT NULL,
  `I_Fængsel` tinyint(1) NOT NULL,
  `Bil_ID` int(11) NOT NULL,
  `Spil_ID` int(11) NOT NULL,
  `Navn` varchar(45) NOT NULL,
  `Beholdning` int(11) NOT NULL,
  PRIMARY KEY (`Spiller_ID`),
  UNIQUE KEY `Spiller_ID_UNIQUE` (`Spiller_ID`),
  KEY `Bil_ID_idx` (`Bil_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Spiller`
--

LOCK TABLES `Spiller` WRITE;
/*!40000 ALTER TABLE `Spiller` DISABLE KEYS */;
INSERT INTO `Spiller` VALUES (0,7,0,0,0,0,0,'a',3935),(1,3,0,0,0,0,0,'b',3995);
/*!40000 ALTER TABLE `Spiller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `getspillerinfo`
--

DROP TABLE IF EXISTS `getspillerinfo`;
/*!50001 DROP VIEW IF EXISTS `getspillerinfo`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `getspillerinfo` AS SELECT 
 1 AS `Spiller_ID`,
 1 AS `Spiller_placering`,
 1 AS `Frikort`,
 1 AS `I_Fængsel`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'Monopoly1'
--

--
-- Dumping routines for database 'Monopoly1'
--
/*!50003 DROP PROCEDURE IF EXISTS `AddPlayer` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AddPlayer`(IN ID INT, IN Placering INT, in Frikort Tinyint, I_Fængsel tinyint, IN Konto_ID  INT, IN Bil_ID INT, IN Spil_ID INT)
BEGIN
INSERT INTO Spiller (Spiller_ID, Spiller_placering, Frikort, I_Fængsel, Konto_ID, Bil_ID, Spil_ID) VALUES (ID, Placering, Frikort, I_Fængsel, Konto_ID, Bil_ID, Spil_ID);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `deleteAllPlayerData` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteAllPlayerData`()
BEGIN
TRUNCATE Spiller;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertToPlayers` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertToPlayers`(IN ID INT, IN P INT, IN N VARCHAR(45), IN Beholdning INT)
BEGIN
INSERT INTO Spiller(Spiller_ID, Spiller_placering, Navn ,Beholdning) VALUES (ID, P, N, Beholdning);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `UpdatePlayers` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `UpdatePlayers`(IN P INT, IN Beholdning INT, IN ID INT)
BEGIN
UPDATE Spiller 
SET Spiller_placering = p, Beholdning = Beholdning
WHERE Spiller_ID = ID;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `getspillerinfo`
--

/*!50001 DROP VIEW IF EXISTS `getspillerinfo`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `getspillerinfo` AS select `spiller`.`Spiller_ID` AS `Spiller_ID`,`spiller`.`Spiller_placering` AS `Spiller_placering`,`spiller`.`Frikort` AS `Frikort`,`spiller`.`I_Fængsel` AS `I_Fængsel` from `spiller` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-03 17:10:58
