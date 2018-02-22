-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 11-Dez-2017 às 21:53
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `peixaria`
--
CREATE DATABASE IF NOT EXISTS `peixaria` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `peixaria`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cep`
--

CREATE TABLE `Cep` (
  `codigo` int(11) NOT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `id_Endereco` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Cep`
--

INSERT INTO `Cep` (`codigo`, `numero`, `id_Endereco`) VALUES
(1, '29700-587', 1),
(2, '29700-550', 2),
(3, '29700-500', 3),
(4, '29700-540', 4),
(5, '29700-400', 5),
(6, '29700-300', 6),
(7, '29702-150', 7),
(8, '29700-100', 8),
(9, '29700-400', 9),
(10, '29700-430', 10),
(11, '29700-420', 11),
(12, '29700-587', 12),
(13, '29700-587', 13),
(14, '29700-420', 14),
(15, '29700-500', 15),
(16, '29700-500', 16),
(17, '29700-410', 17),
(18, '29700-425', 18),
(19, '29700-425', 19),
(20, '29700-435', 20),
(21, '29700-435', 21),
(22, '29700-435', 22),
(23, '29700-550', 23),
(24, '29700-550', 24),
(25, '29700-550', 25),
(26, '29700-545', 26),
(27, '29700-500', 27),
(28, '29700-435', 28);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cliente`
--

CREATE TABLE `Cliente` (
  `cpf` varchar(255) DEFAULT NULL,
  `dataNasc` date DEFAULT NULL,
  `sexo` char(1) NOT NULL,
  `codigo` int(11) NOT NULL,
  `cep_codigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Cliente`
--

INSERT INTO `Cliente` (`cpf`, `dataNasc`, `sexo`, `codigo`, `cep_codigo`) VALUES
('540.878.237-16', '2001-01-01', 'M', 4, 4),
('324.576.134-36', '2002-02-02', 'F', 5, 9),
('132.981.390-85', '2003-03-03', 'M', 6, 6),
('476.458.597-34', '2005-05-05', 'F', 7, 7),
('098.340.983-45', '2006-06-06', 'F', 8, 8),
('657.484.785-74', '2007-07-07', 'M', 9, 10),
('584.648.585-64', '2008-08-08', 'M', 11, 17),
('048.474.757-38', '1993-06-20', 'F', 14, 28),
('986.385.648-37', '1998-01-18', 'M', 15, 25);

-- --------------------------------------------------------

--
-- Estrutura da tabela `CustoFixo`
--

CREATE TABLE `CustoFixo` (
  `codigo` int(11) NOT NULL,
  `custoFixo` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `preco` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `CustoFixo`
--

INSERT INTO `CustoFixo` (`codigo`, `custoFixo`, `date`, `preco`) VALUES
(1, 'Segurança', '2017-12-06', 200),
(2, 'Limpeza', '2017-12-06', 400),
(3, 'Telefone', '2017-12-06', 70),
(4, 'Manutenção', '2017-12-06', 100),
(5, 'Aluguel', '2017-12-06', 800),
(6, 'Telefone', '2017-12-11', 60);

-- --------------------------------------------------------

--
-- Estrutura da tabela `CustoVariavel`
--

CREATE TABLE `CustoVariavel` (
  `codigo` int(11) NOT NULL,
  `custoVariavel` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `preco` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `CustoVariavel`
--

INSERT INTO `CustoVariavel` (`codigo`, `custoVariavel`, `date`, `preco`) VALUES
(1, 'Energia', '2017-12-06', 100),
(2, 'Água', '2017-12-06', 80),
(3, 'Mão de obra', '2017-12-06', 500),
(4, 'Pacu', '2012-12-06', 600),
(5, 'Pirarucu', '2012-12-06', 1200),
(6, 'Tambaqui', '2012-12-06', 2000),
(7, 'Matrinxã', '2012-12-06', 500),
(8, 'Dourado', '2012-12-06', 900),
(9, 'Filhote', '2012-12-06', 750),
(10, 'Bacalhau', '2012-12-06', 3520),
(11, 'Tilápia', '2017-12-06', 1000),
(12, 'Gasto', '2017-12-06', 70),
(13, 'Piaba', '2017-12-11', 250),
(14, 'Surubim', '2017-12-11', 200);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Endereco`
--

CREATE TABLE `Endereco` (
  `codigo` int(11) NOT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `numero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Endereco`
--

INSERT INTO `Endereco` (`codigo`, `bairro`, `cidade`, `estado`, `logradouro`, `numero`) VALUES
(1, 'Colatina Velha ', 'Colatina', 'ES', 'Nove ', 453),
(2, 'Colatina Velha', 'Colatina', 'ES', 'Pedro Epichim', 532),
(3, 'São Vicente', 'Colatina', 'ES', 'Joaquim Lucas Sobrinho', 98),
(4, 'Colatina Velha', 'Colatina', 'ES', 'Aracy Mendes', 563),
(5, 'São Vicente', 'Colatina', 'ES', 'Antônio Cherotto', 876),
(6, 'Centro', 'Colatina', 'ES', 'Assis Chateaubriand', 342),
(7, 'Vila Nova', 'Colatina', 'ES', 'Marechal Eurico Gaspar Dutra', 975),
(8, 'Centro', 'Colatina', 'ES', 'Michel Dalla', 876),
(9, 'São Vicente', 'Colatina', 'ES', 'Antônio Cherotto', 876),
(10, 'São Vicente', 'Colatina', 'ES', 'Alfredo Zurlo', 765),
(11, 'São Vicente', 'Colatina', 'ES', 'Manoel Antunes Moreira', 678),
(12, 'Colatina Velha ', 'Colatina', 'ES', 'Nove ', 453),
(13, 'Colatina Velha ', 'Colatina', 'ES', 'Nove ', 453),
(14, 'São Vicente', 'Colatina', 'ES', 'Manoel Antunes Moreira', 678),
(15, 'São Vicente', 'Colatina', 'ES', 'Joaquim Lucas Sobrinho', 98),
(16, 'São Vicente', 'Colatina', 'ES', 'Joaquim Lucas Sobrinho', 98),
(17, 'São Vicente', 'Colatina', 'ES', 'Luís Prestes', 879),
(18, 'São Vicente', 'Colatina', 'ES', 'Ana Subtil', 765),
(19, 'São Vicente', 'Colatina', 'ES', 'Ana Subtil', 765),
(20, 'São Vicente', 'Colatina', 'ES', 'Liberalino Moraes', 867),
(21, 'São Vicente', 'Colatina', 'ES', 'Liberalino Moraes', 987),
(22, 'São Vicente', 'Colatina', 'ES', 'Liberalino Moraes', 987),
(23, 'Colatina Velha', 'Colatina', 'ES', 'Pedro Epichim', 532),
(24, 'Colatina Velha', 'Colatina', 'ES', 'Pedro Epichim', 532),
(25, 'Colatina Velha', 'Colatina', 'ES', 'Pedro Epichim', 385),
(26, 'Colatina Velha', 'Colatina', 'ES', 'Hecleu Mesquita', 987),
(27, 'São Vicente', 'Colatina', 'ES', 'Joaquim Lucas Sobrinho', 98),
(28, 'São Vicente', 'Colatina', 'ES', 'Liberalino Moraes', 987);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Fisico`
--

CREATE TABLE `Fisico` (
  `cpf` varchar(255) DEFAULT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Fisico`
--

INSERT INTO `Fisico` (`cpf`, `codigo`) VALUES
('664.746.473-73', 1),
('245.345.234-55', 2),
('795.847.372-74', 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Fornecedor`
--

CREATE TABLE `Fornecedor` (
  `codigo` int(11) NOT NULL,
  `cep_codigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Fornecedor`
--

INSERT INTO `Fornecedor` (`codigo`, `cep_codigo`) VALUES
(1, 13),
(10, 14),
(12, 18),
(13, 20),
(2, 24),
(16, 26),
(3, 27);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Item`
--

CREATE TABLE `Item` (
  `codigo` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `peso` float NOT NULL,
  `precoCompra` float NOT NULL,
  `id_CustoVariavel` int(11) DEFAULT NULL,
  `fornecedor_codigo` int(11) DEFAULT NULL,
  `id_Peixe` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Item`
--

INSERT INTO `Item` (`codigo`, `date`, `peso`, `precoCompra`, `id_CustoVariavel`, `fornecedor_codigo`, `id_Peixe`) VALUES
(1, '2012-12-06', 100, 600, 4, 1, 1),
(2, '2012-12-06', 100, 1200, 5, 2, 2),
(3, '2012-12-06', 100, 2000, 6, 3, 3),
(4, '2012-12-06', 100, 500, 7, 1, 4),
(5, '2012-12-06', 100, 900, 8, 2, 5),
(6, '2012-12-06', 100, 750, 9, 3, 6),
(7, '2012-12-06', 100, 3520, 10, 1, 7),
(8, '2017-12-06', 100, 1000, 11, 10, 8),
(9, '2017-12-11', 50, 250, 13, 12, 9),
(10, '2017-12-11', 50, 250, 14, 3, 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Juridico`
--

CREATE TABLE `Juridico` (
  `cnpj` varchar(255) DEFAULT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Juridico`
--

INSERT INTO `Juridico` (`cnpj`, `codigo`) VALUES
('89.067.965/7576-65', 3),
('48.567.584/7484-75', 12),
('93.758.564/8564-84', 13),
('65.437.354/6372-26', 16);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Login`
--

CREATE TABLE `Login` (
  `codigo` int(11) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Login`
--

INSERT INTO `Login` (`codigo`, `login`, `senha`) VALUES
(1, 'peixe', 'peixe');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Peixe`
--

CREATE TABLE `Peixe` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `precoVenda` float NOT NULL,
  `qtdEstoque` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Peixe`
--

INSERT INTO `Peixe` (`codigo`, `nome`, `precoVenda`, `qtdEstoque`) VALUES
(1, 'Pacu', 12, 84),
(2, 'Pirarucu', 24, 85),
(3, 'Tambacu', 40, 91),
(4, 'Matrinxã', 10, 88),
(5, 'Dourado', 18, 85.5),
(6, 'Filhote', 15, 88),
(7, 'Bacalhau', 71, 81.5),
(8, 'Tilápia', 20, 100),
(9, 'Piaba', 10, 50),
(10, 'Surubim', 15, 50);

-- --------------------------------------------------------

--
-- Estrutura da tabela `PeixeVendido`
--

CREATE TABLE `PeixeVendido` (
  `codigo` int(11) NOT NULL,
  `pesoPeixe` float NOT NULL,
  `preco` float NOT NULL,
  `peixe_codigo` int(11) DEFAULT NULL,
  `venda_codigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `PeixeVendido`
--

INSERT INTO `PeixeVendido` (`codigo`, `pesoPeixe`, `preco`, `peixe_codigo`, `venda_codigo`) VALUES
(1, 2, 25, 1, 1),
(2, 2, 48, 2, 1),
(3, 2, 80.6, 3, 1),
(4, 2, 20, 4, 1),
(5, 2, 36, 5, 1),
(6, 2, 30, 6, 1),
(7, 2, 142.8, 7, 1),
(8, 3, 72, 2, 2),
(9, 4, 161.2, 3, 2),
(10, 1, 71.4, 7, 3),
(11, 4, 284, 7, 4),
(12, 3, 45, 6, 5),
(13, 10, 100, 4, 6),
(14, 4, 48, 1, 7),
(15, 4, 96, 2, 7),
(16, 8, 96, 1, 9),
(17, 8.5, 153, 5, 9),
(18, 8.5, 603.5, 7, 9),
(19, 2, 48, 2, 10),
(20, 2, 30, 6, 11),
(21, 3, 213, 7, 12),
(22, 4, 72, 5, 12),
(23, 5, 75, 6, 13),
(24, 2, 24, 1, 14);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Pessoa`
--

CREATE TABLE `Pessoa` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Pessoa`
--

INSERT INTO `Pessoa` (`codigo`, `nome`, `telefone`) VALUES
(1, 'Marcos', '(38) 34879-3439'),
(2, 'Joana', '(56) 78567-8645'),
(3, 'Norte Pescado', '(98) 34873-3495'),
(4, 'Sergio', '(09) 87450-2865'),
(5, 'Alice', '(23) 12313-2423'),
(6, 'Miguel', '(84) 53823-9346'),
(7, 'Sophia', '(54) 23982-3098'),
(8, 'Arthur', '(34) 79823-2011'),
(9, 'Paulo ', '(57) 48389-4858'),
(10, 'Pedro', '(99) 68584-8382'),
(11, 'Marcos', '(29) 57584-7584'),
(12, 'Easy Fish', '(95) 85746-3652'),
(13, 'Clube do Peixe', '(96) 75648-3658'),
(14, 'Luiza', '(94) 75375-8483'),
(15, ' Guibson', '(27) 99589-6538'),
(16, 'Compre Peixe', '(87) 65456-7886');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Venda`
--

CREATE TABLE `Venda` (
  `codigo` int(11) NOT NULL,
  `custoTotal` float NOT NULL,
  `date` date DEFAULT NULL,
  `cliente_codigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Venda`
--

INSERT INTO `Venda` (`codigo`, `custoTotal`, `date`, `cliente_codigo`) VALUES
(1, 382.4, '2017-12-06', 4),
(2, 233.2, '2017-12-06', 5),
(3, 71.4, '2017-12-06', 4),
(4, 284, '2017-12-06', 4),
(5, 45, '2017-12-06', 8),
(6, 100, '2017-12-06', 8),
(7, 144, '2017-12-06', 4),
(9, 852.5, '2017-12-06', 7),
(10, 48, '2017-12-10', 4),
(11, 30, '2017-12-10', 5),
(12, 285, '2017-12-11', 7),
(13, 75, '2017-12-11', 14),
(14, 24, '2017-12-11', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cep`
--
ALTER TABLE `Cep`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_n8wp2h0f60fco9j78npw8aeh4` (`id_Endereco`);

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_endtw8cajemb09w3nyyl35my0` (`cep_codigo`);

--
-- Indexes for table `CustoFixo`
--
ALTER TABLE `CustoFixo`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `CustoVariavel`
--
ALTER TABLE `CustoVariavel`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `Endereco`
--
ALTER TABLE `Endereco`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `Fisico`
--
ALTER TABLE `Fisico`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `Fornecedor`
--
ALTER TABLE `Fornecedor`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_3rmb3rju68wpkooo1j0gk5nhj` (`cep_codigo`);

--
-- Indexes for table `Item`
--
ALTER TABLE `Item`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_dimwnr8dn5b33nufm04uw6c2w` (`id_CustoVariavel`),
  ADD KEY `FK_59g0t7r7yno7g7i4b5spnumft` (`fornecedor_codigo`),
  ADD KEY `FK_sjspk4uqcwqmuxwelug4utty9` (`id_Peixe`);

--
-- Indexes for table `Juridico`
--
ALTER TABLE `Juridico`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `Peixe`
--
ALTER TABLE `Peixe`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `PeixeVendido`
--
ALTER TABLE `PeixeVendido`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_65xxicvd7vars3sjbrx0votta` (`peixe_codigo`),
  ADD KEY `FK_61vgd6qy9dh6jh21ifbn5rylt` (`venda_codigo`);

--
-- Indexes for table `Pessoa`
--
ALTER TABLE `Pessoa`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `Venda`
--
ALTER TABLE `Venda`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK_ass4ciu3lp1ipkofx918j7nm7` (`cliente_codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Cep`
--
ALTER TABLE `Cep`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `CustoFixo`
--
ALTER TABLE `CustoFixo`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `CustoVariavel`
--
ALTER TABLE `CustoVariavel`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `Endereco`
--
ALTER TABLE `Endereco`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `Item`
--
ALTER TABLE `Item`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `Login`
--
ALTER TABLE `Login`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `Peixe`
--
ALTER TABLE `Peixe`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `PeixeVendido`
--
ALTER TABLE `PeixeVendido`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `Pessoa`
--
ALTER TABLE `Pessoa`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `Venda`
--
ALTER TABLE `Venda`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `Cep`
--
ALTER TABLE `Cep`
  ADD CONSTRAINT `FK_n8wp2h0f60fco9j78npw8aeh4` FOREIGN KEY (`id_Endereco`) REFERENCES `Endereco` (`codigo`);

--
-- Limitadores para a tabela `Cliente`
--
ALTER TABLE `Cliente`
  ADD CONSTRAINT `FK_3h5ln3mcgiexb5m175skfcaeo` FOREIGN KEY (`codigo`) REFERENCES `Pessoa` (`codigo`),
  ADD CONSTRAINT `FK_endtw8cajemb09w3nyyl35my0` FOREIGN KEY (`cep_codigo`) REFERENCES `Cep` (`codigo`);

--
-- Limitadores para a tabela `Fisico`
--
ALTER TABLE `Fisico`
  ADD CONSTRAINT `FK_oht4kpcji3xpbwjaelgblx0l5` FOREIGN KEY (`codigo`) REFERENCES `Fornecedor` (`codigo`);

--
-- Limitadores para a tabela `Fornecedor`
--
ALTER TABLE `Fornecedor`
  ADD CONSTRAINT `FK_3rmb3rju68wpkooo1j0gk5nhj` FOREIGN KEY (`cep_codigo`) REFERENCES `Cep` (`codigo`),
  ADD CONSTRAINT `FK_64o1w3ox782mjgkshtfq1rkoc` FOREIGN KEY (`codigo`) REFERENCES `Pessoa` (`codigo`);

--
-- Limitadores para a tabela `Item`
--
ALTER TABLE `Item`
  ADD CONSTRAINT `FK_59g0t7r7yno7g7i4b5spnumft` FOREIGN KEY (`fornecedor_codigo`) REFERENCES `Fornecedor` (`codigo`),
  ADD CONSTRAINT `FK_dimwnr8dn5b33nufm04uw6c2w` FOREIGN KEY (`id_CustoVariavel`) REFERENCES `CustoVariavel` (`codigo`),
  ADD CONSTRAINT `FK_sjspk4uqcwqmuxwelug4utty9` FOREIGN KEY (`id_Peixe`) REFERENCES `Peixe` (`codigo`);

--
-- Limitadores para a tabela `Juridico`
--
ALTER TABLE `Juridico`
  ADD CONSTRAINT `FK_qpf75li0v79shvyeq2l9k2y9s` FOREIGN KEY (`codigo`) REFERENCES `Fornecedor` (`codigo`);

--
-- Limitadores para a tabela `PeixeVendido`
--
ALTER TABLE `PeixeVendido`
  ADD CONSTRAINT `FK_61vgd6qy9dh6jh21ifbn5rylt` FOREIGN KEY (`venda_codigo`) REFERENCES `Venda` (`codigo`),
  ADD CONSTRAINT `FK_65xxicvd7vars3sjbrx0votta` FOREIGN KEY (`peixe_codigo`) REFERENCES `Peixe` (`codigo`);

--
-- Limitadores para a tabela `Venda`
--
ALTER TABLE `Venda`
  ADD CONSTRAINT `FK_ass4ciu3lp1ipkofx918j7nm7` FOREIGN KEY (`cliente_codigo`) REFERENCES `Cliente` (`codigo`);
--
-- Database: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(11) NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Extraindo dados da tabela `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"peixaria\",\"table\":\"Peixe\"},{\"db\":\"peixaria\",\"table\":\"PeixeVendido\"},{\"db\":\"peixaria\",\"table\":\"Venda\"},{\"db\":\"peixaria\",\"table\":\"Login\"},{\"db\":\"peixaria\",\"table\":\"Pessoa\"},{\"db\":\"peixaria\",\"table\":\"Fornecedor\"},{\"db\":\"peixaria\",\"table\":\"Endereco\"},{\"db\":\"peixaria\",\"table\":\"Cliente\"},{\"db\":\"peixaria\",\"table\":\"CustoFixo\"},{\"db\":\"peixaria\",\"table\":\"Relatorio\"}]');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT '0',
  `x` float UNSIGNED NOT NULL DEFAULT '0',
  `y` float UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin,
  `data_sql` longtext COLLATE utf8_bin,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Extraindo dados da tabela `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2017-11-13 19:25:21', '{\"collation_connection\":\"utf8mb4_unicode_ci\",\"lang\":\"pt\"}');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Estrutura da tabela `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Indexes for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Indexes for table `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Indexes for table `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Indexes for table `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Indexes for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Indexes for table `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Indexes for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Indexes for table `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Indexes for table `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Indexes for table `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Indexes for table `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Indexes for table `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Indexes for table `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
