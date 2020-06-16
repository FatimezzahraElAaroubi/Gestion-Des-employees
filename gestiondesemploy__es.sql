-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 16 Juin 2020 à 17:38
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestiondesemployées`
--

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

CREATE TABLE IF NOT EXISTS `employe` (
  `codeEMP` varchar(50) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(50) DEFAULT NULL,
  `adresse` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `sexe` varchar(50) DEFAULT NULL,
  `Service` varchar(50) DEFAULT NULL,
  `Numero` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codeEMP`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `employe`
--

INSERT INTO `employe` (`codeEMP`, `nom`, `prenom`, `adresse`, `telephone`, `sexe`, `Service`, `Numero`) VALUES
('cfbgf', 'dfdsgd', 'fatima', 'gxgfnxfg', '0623514203', 'Femme', 'comptable', 'vbgfn'),
('g123', 'aroubi', 'fati', 'wx<cvcxvccx', '0653214096', 'Femme', 'commerce', '23685'),
('dssfds', 'nbvc', 'bnbn', 'hnxgfnfg', '0632514201', 'Homme', 'Informatique', '123'),
('12345', 'dsqfsdg', 'xwcw', 'cvvcbcvwx', '0632514230', 'Femme', 'comptable', '425');

-- --------------------------------------------------------

--
-- Structure de la table `societe`
--

CREATE TABLE IF NOT EXISTS `societe` (
  `Numero` varchar(50) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `Adresse` varchar(50) DEFAULT NULL,
  `raison_social` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `Ville` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Numero`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `societe`
--

INSERT INTO `societe` (`Numero`, `nom`, `Adresse`, `raison_social`, `telephone`, `Ville`) VALUES
('123', 'svs', 'sqqsf', 'sqsd', '0623514263', 'ait imour'),
('459', 'sarl', 'wdvfds', 'cxvcx', '053621420', 'efdsf');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
