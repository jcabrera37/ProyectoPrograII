-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-10-2021 a las 17:32:56
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemabd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE `area` (
  `id_area` int(11) NOT NULL,
  `nombre_area` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`id_area`, `nombre_area`) VALUES
(1, 'CONCACAF'),
(2, 'CONMEBOL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `id_pais` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Estadio` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `img_bandera` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`id_pais`, `Nombre`, `Estadio`, `img_bandera`) VALUES
(1, 'Guatemala', 'Mateo Flores', 'bandera/bandera_guatemala.jpg'),
(2, 'Mexico', 'Estadio Azteca', 'bandera/bandera_mexico.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `tipo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_spanish2_ci NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id_rol`, `nombre`, `tipo`, `status`) VALUES
(1, 'Administrador', 'Admin', 'Activo'),
(2, 'Usuario', 'user', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seleccion`
--

CREATE TABLE `seleccion` (
  `id_seleccion` int(11) NOT NULL,
  `seleccion` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `id_pais` int(11) NOT NULL,
  `img_uniforme` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `id_area` int(11) NOT NULL,
  `Ranking` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `seleccion`
--

INSERT INTO `seleccion` (`id_seleccion`, `seleccion`, `id_pais`, `img_uniforme`, `id_area`, `Ranking`) VALUES
(1, 'Federación Nacional de Futbol de Guatemala', 1, 'uniforme/uniforme_guate.jpg', 1, 1390);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_jugador`
--

CREATE TABLE `tipo_jugador` (
  `id_tipo` int(11) NOT NULL,
  `tipo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `apellidos` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `usuario` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `pass` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 1,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombres`, `apellidos`, `usuario`, `pass`, `status`, `id_rol`) VALUES
(1, 'Nicolas', 'Hagen', 'nhagen', '12345', 1, 2),
(2, 'Darwin', 'Lom', 'dlom', '12345', 1, 2),
(3, 'Administrador', 'Guatemala', 'admin', '12345', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`id_area`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`id_pais`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `seleccion`
--
ALTER TABLE `seleccion`
  ADD PRIMARY KEY (`id_seleccion`),
  ADD KEY `seleccion-pais` (`id_pais`),
  ADD KEY `seleccion-area` (`id_area`);

--
-- Indices de la tabla `tipo_jugador`
--
ALTER TABLE `tipo_jugador`
  ADD PRIMARY KEY (`id_tipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `rol-usuario` (`id_rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `area`
--
ALTER TABLE `area`
  MODIFY `id_area` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `id_pais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `seleccion`
--
ALTER TABLE `seleccion`
  MODIFY `id_seleccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tipo_jugador`
--
ALTER TABLE `tipo_jugador`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `seleccion`
--
ALTER TABLE `seleccion`
  ADD CONSTRAINT `seleccion-area` FOREIGN KEY (`id_area`) REFERENCES `area` (`id_area`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `seleccion-pais` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`id_pais`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `rol-usuario` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id_rol`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
