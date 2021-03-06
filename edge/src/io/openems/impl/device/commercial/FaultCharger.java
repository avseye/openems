package io.openems.impl.device.commercial;

import io.openems.api.channel.thingstate.FaultEnum;
import io.openems.common.types.ThingStateInfo;

@ThingStateInfo(reference = FeneconCommercialCharger.class)
public enum FaultCharger implements FaultEnum {
	HighVoltageSideOfDCConverterUndervoltage(0), //
	HighVoltageSideOfDCConverterOvervoltage(1), //
	LowVoltageSideOfDCConverterUndervoltage(2), //
	LowVoltageSideOfDCConverterOvervoltage(3), //
	HighVoltageSideOfDCConverterOvercurrentFault(4), //
	LowVoltageSideOfDCConverterOvercurrentFault(5), //
	DCConverterIGBTFault(6), //
	DCConverterPrechargeUnmet(7), //
	BECUCommunicationDisconnected(8), //
	DCConverterCommunicationDisconnected(9), //
	CurrentConfigurationOverRange(10), //
	TheBatteryRequestStop(11), //
	OvercurrentRelayFault(12), //
	LightningProtectionDeviceFault(13), //
	DCConverterPriamaryContactorDisconnectedAbnormally(14), //
	DCDisconnectedAbnormallyOnLowVoltageSideOfDCConvetor(15), //
	DCConvetorEEPROMAbnormity1(16), //
	DCConvetorEEPROMAbnormity1Second(17), //
	EDCConvetorEEPROMAbnormity1(18), //
	DCConvertorGeneralOverload(19), //
	DCShortCircuit(20), //
	PeakPulseCurrentProtection(21), //
	DCDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(22), //
	EffectivePulseValueOverhigh(23), //
	DCConverteSevereOverload(24), //
	DCBreakerDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(25), //
	DCBreakerDisconnectAbnormallyOnLowVoltageSideOfDCConvetor(26), //
	DCConvetorPrechargeContactorCloseFailed(27), //
	DCConvetorMainContactorCloseFailed(28), //
	ACContactorStateAbnormityOfDCConvetor(29), //
	DCConvetorEmergencyStop(30), //
	DCConverterChargingGunDisconnected(31), //
	DCCurrentAbnormityBeforeDCConvetorWork(32), //
	FuSeDisconnected(33), //
	DCConverterHardwareCurrentOrVoltageFault(34), //
	DCConverterCrystalOscillatorCircuitInvalidation(35), //
	DCConverterResetCircuitInvalidation(36), //
	DCConverterSamplingCircuitInvalidation(37), //
	DCConverterDigitalIOCircuitInvalidation(38), //
	DCConverterPWMCircuitInvalidation(39), //
	DCConverterX5045CircuitInvalidation(40), //
	DCConverterCANCircuitInvalidation(41), //
	DCConverterSoftwareANDHardwareProtectionCircuitInvalidation(42), //
	DCConverterPowerCircuitInvalidation(43), //
	DCConverterCPUInvalidation(44), //
	DCConverterTINT0InterruptInvalidation(45), //
	DCConverterADCInterruptInvalidation(46), //
	DCConverterCAPITN4InterruptInvalidation(47), //
	DCConverterCAPINT6InterruptInvalidation(48), //
	DCConverterT3PINTinterruptInvalidation(49), //
	DCConverterT4PINTinterruptInvalidation(50), //
	DCConverterPDPINTAInterruptInvalidation(51), //
	DCConverterT1PINTInterruptInvalidation(52), //
	DCConverterRESVInterruptInvalidation(53), //
	DCConverter100usTaskInvalidation(54), //
	DCConverterClockInvalidation(55), //
	DCConverterEMSMemoryInvalidation(56), //
	DCConverterExteriorCommunicationInvalidation(57), //
	DCConverterIOInterfaceInvalidation(58), //
	DCConverterInputVoltageBoundFault(59), //
	DCConverterOutterVoltageBoundFault(60), //
	DCConverterOutputVoltageBoundFault(61), //
	DCConverterInductCurrentBoundFault(62), //
	DCConverterInputCurrentBoundFault(63), //
	DCConverterOutputCurrentBoundFault(64), //
	DCReactorOverTemperature(65), //
	DCIGBTOverTemperature(66), //
	DCConverterChanel3OverTemperature(67), //
	DCConverterChanel4OverTemperature(68), //
	DCConverterChanel5OverTemperature(69), //
	DCConverterChanel6OverTemperature(70), //
	DCConverterChanel7OverTemperature(71), //
	DCConverterChanel8OverTemperature(72), //
	DCReactorTemperatureSamplingInvalidation(73), //
	DCIGBTTemperatureSamplingInvalidation(74), //
	DCConverterChanel3TemperatureSamplingInvalidation(75), //
	DCConverterChanel4TemperatureSamplingInvalidation(76), //
	DCConverterChanel5TemperatureSamplingInvalidation(77), //
	DCConverterChanel6TemperatureSamplingInvalidation(78), //
	DCConverterChanel7TemperatureSamplingInvalidation(79), //
	DCConverterChanel8TemperatureSamplingInvalidation(80), //
	DCConverterInductanceCurrentSamplingInvalidation(81), //
	CurrentSamplingInvalidationOnTheLowVoltageSideOfDCConverter(82), //
	VoltageSamplingInvalidationOnTheLowVoltageSideOfDCConverter(83), //
	InsulationInspectionFault(84), //
	NegContactorCloseUnsuccessly(85), //
	NegContactorCutWhenRunning(86), //
	BmsDCDC1HighVoltageSideOfDCConverterUndervoltage(87), //
	BmsDCDC1HighVoltageSideOfDCConverterOvervoltage(88), //
	BmsDCDC1LowVoltageSideOfDCConverterUndervoltage(89), //
	BmsDCDC1LowVoltageSideOfDCConverterOvervoltage(90), //
	BmsDCDC1HighVoltageSideOfDCConverterOvercurrentFault(91), //
	BmsDCDC1LowVoltageSideOfDCConverterOvercurrentFault(92), //
	BmsDCDC1DCConverterIGBTFault(93), //
	BmsDCDC1DCConverterPrechargeUnmet(94), //
	BmsDCDC1BECUCommunicationDisconnected(95), //
	BmsDCDC1DCConverterCommunicationDisconnected(96), //
	BmsDCDC1CurrentConfigurationOverRange(97), //
	BmsDCDC1TheBatteryRequestStop(98), //
	BmsDCDC1OvercurrentRelayFault(99), //
	BmsDCDC1LightningProtectionDeviceFault(100), //
	BmsDCDC1DCConverterPriamaryContactorDisconnectedAbnormally(101), //
	BmsDCDC1DCDisconnectedAbnormallyOnLowVoltageSideOfDCConvetor(102), //
	BmsDCDC1DCConvetorEEPROMAbnormity1(103), //
	BmsDCDC1DCConvetorEEPROMAbnormity1Second(104), //
	BmsDCDC1EDCConvetorEEPROMAbnormity1(105), //
	BsmDCDC1DCConvertorGeneralOverload(106), //
	BsmDCDC1DCShortCircuit(107), //
	BsmDCDC1PeakPulseCurrentProtection(108), //
	BsmDCDC1DCDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(109), //
	BsmDCDC1EffectivePulseValueOverhigh(110), //
	BsmDCDC1DCConverteSevereOverload(111), //
	BsmDCDC1DCBreakerDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(112), //
	BsmDCDC1DCBreakerDisconnectAbnormallyOnLowVoltageSideOfDCConvetor(113), //
	BsmDCDC1DCConvetorPrechargeContactorCloseFailed(114), //
	BsmDCDC1DCConvetorMainContactorCloseFailed(115), //
	BsmDCDC1ACContactorStateAbnormityOfDCConvetor(116), //
	BsmDCDC1DCConvetorEmergencyStop(117), //
	BsmDCDC1DCConverterChargingGunDisconnected(118), //
	BsmDCDC1DCCurrentAbnormityBeforeDCConvetorWork(119), //
	BsmDCDC1FuSeDisconnected(120), //
	BsmDCDC1DCConverterHardwareCurrentOrVoltageFault(121), //
	BmsDCDC1DCConverterCrystalOscillatorCircuitInvalidation(122), //
	BmsDCDC1DCConverterResetCircuitInvalidation(123), //
	BmsDCDC1DCConverterSamplingCircuitInvalidation(124), //
	BmsDCDC1DCConverterDigitalIOCircuitInvalidation(125), //
	BmsDCDC1DCConverterPWMCircuitInvalidation(126), //
	BmsDCDC1DCConverterX5045CircuitInvalidation(127), //
	BmsDCDC1DCConverterCANCircuitInvalidation(128), //
	BmsDCDC1DCConverterSoftwareANDHardwareProtectionCircuitInvalidation(129), //
	BmsDCDC1DCConverterPowerCircuitInvalidation(130), //
	BmsDCDC1DCConverterCPUInvalidation(131), //
	BmsDCDC1DCConverterTINT0InterruptInvalidation(132), //
	BmsDCDC1DCConverterADCInterruptInvalidation(133), //
	BmsDCDC1DCConverterCAPITN4InterruptInvalidation(134), //
	BmsDCDC1DCConverterCAPINT6InterruptInvalidation(135), //
	BmsDCDC1DCConverterT3PINTinterruptInvalidation(136), //
	BmsDCDC1DCConverterT4PINTinterruptInvalidation(137), //
	BmsDCDC1DCConverterPDPINTAInterruptInvalidation(138), //
	BmsDCDC1DCConverterT1PINTInterruptInvalidationSecond(139), //
	BmsDCDC1DCConverterRESVInterruptInvalidation(140), //
	BmsDCDC1DCConverter100usTaskInvalidation(141), //
	BmsDCDC1DCConverterClockInvalidation(142), //
	BmsDCDC1DCConverterEMSMemoryInvalidation(143), //
	BmsDCDC1DCConverterExteriorCommunicationInvalidation(144), //
	BmsDCDC1DCConverterIOInterfaceInvalidation(145), //
	BmsDCDC1DCConverterInputVoltageBoundFault(146), //
	BmsDCDC1DCConverterOutterVoltageBoundFault(147), //
	BmsDCDC1DCConverterOutputVoltageBoundFault(148), //
	BmsDCDC1DCConverterInductCurrentBoundFault(149), //
	BmsDCDC1DCConverterInputCurrentBoundFault(150), //
	BmsDCDC1DCConverterOutputCurrentBoundFault(151), //
	BmsDCDC1DCReactorOverTemperature(152), //
	BmsDCDC1DCIGBTOverTemperature(153), //
	BmsDCDC1DCConverterChanel3OverTemperature(154), //
	BmsDCDC1DCConverterChanel4OverTemperature(155), //
	BmsDCDC1DCConverterChanel5OverTemperature(156), //
	BmsDCDC1DCConverterChanel6OverTemperature(157), //
	BmsDCDC1DCConverterChanel7OverTemperature(158), //
	BmsDCDC1DCConverterChanel8OverTemperature(159), //
	BmsDCDC1DCReactorTemperatureSamplingInvalidation(160), //
	BmsDCDC1DCIGBTTemperatureSamplingInvalidation(161), //
	BmsDCDC1DCConverterChanel3TemperatureSamplingInvalidation(162), //
	BmsDCDC1DCConverterChanel4TemperatureSamplingInvalidation(163), //
	BmsDCDC1DCConverterChanel5TemperatureSamplingInvalidation(164), //
	BmsDCDC1DCConverterChanel6TemperatureSamplingInvalidation(165), //
	BmsDCDC1DCConverterChanel7TemperatureSamplingInvalidation(166), //
	BmsDCDC1DCConverterChanel8TemperatureSamplingInvalidation(167), //
	BmsDCDC1DCConverterInductanceCurrentSamplingInvalidation(168), //
	BmsDCDC1CurrentSamplingInvalidationOnTheLowVoltageSideOfDCConverter(169), //
	BmsDCDC1VoltageSamplingInvalidationOnTheLowVoltageSideOfDCConverter(170), //
	BmsDCDC1InsulationInspectionFault(171), //
	BmsDCDC1NegContactorCloseUnsuccessly(172), //
	BmsDCDC1NegContactorCutWhenRunning(173), //
	PvDCDCHighVoltageSideOfDCConverterUndervoltage(174), //
	PvDCDCHighVoltageSideOfDCConverterOvervoltage(175), //
	PvDCDCLowVoltageSideOfDCConverterUndervoltage(176), //
	PvDCDCLowVoltageSideOfDCConverterOvervoltage(177), //
	PvDCDCHighVoltageSideOfDCConverterOvercurrentFault(178), //
	PvDCDCLowVoltageSideOfDCConverterOvercurrentFault(179), //
	PvDCDCDCConverterIGBTFault(180), //
	PvDCDCDCConverterPrechargeUnmet(181), //
	PvDCDCBECUCommunicationDisconnected(182), //
	PvDCDCDCConverterCommunicationDisconnected(183), //
	PvDCDCCurrentConfigurationOverRange(184), //
	PvDCDCTheBatteryRequestStop(185), //
	PvDCDCOvercurrentRelayFault(186), //
	PvDCDCLightningProtectionDeviceFault(187), //
	PvDCDCDCConverterPriamaryContactorDisconnectedAbnormally(188), //
	PvDCDCDCDisconnectedAbnormallyOnLowVoltageSideOfDCConvetor(189), //
	PvDCDCDCConvetorEEPROMAbnormity1(190), //
	PvDCDCDCConvetorEEPROMAbnormity1Second(191), //
	PvDCDCEDCConvetorEEPROMAbnormity1(192), //
	PvDCDCDCConvertorGeneralOverload(193), //
	PvDCDCDCShortCircuit(194), //
	PvDCDCPeakPulseCurrentProtection(195), //
	PvDCDCDCDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(196), //
	PvDCDCEffectivePulseValueOverhigh(197), //
	PvDCDCDCConverteSevereOverload(198), //
	PvDCDCDCBreakerDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(199), //
	PvDCDCDCBreakerDisconnectAbnormallyOnLowVoltageSideOfDCConvetor(200), //
	PvDCDCDCConvetorPrechargeContactorCloseFailed(201), //
	PvDCDCDCConvetorMainContactorCloseFailed(202), //
	PvDCDCACContactorStateAbnormityOfDCConvetor(203), //
	PvDCDCDCConvetorEmergencyStop(204), //
	PvDCDCDCConverterChargingGunDisconnected(205), //
	PvDCDCDCCurrentAbnormityBeforeDCConvetorWork(206), //
	PvDCDCFuSeDisconnected(207), //
	PvDCDCDCConverterHardwareCurrentOrVoltageFault(208), //
	PvDCDCDCConverterCrystalOscillatorCircuitInvalidation(209), //
	PvDCDCDCConverterResetCircuitInvalidation(210), //
	PvDCDCDCConverterSamplingCircuitInvalidation(211), //
	PvDCDCDCConverterDigitalIOCircuitInvalidation(212), //
	PvDCDCDCConverterPWMCircuitInvalidation(213), //
	PvDCDCDCConverterX5045CircuitInvalidation(214), //
	PvDCDCDCConverterCANCircuitInvalidation(215), //
	PvDCDCDCConverterSoftwareANDHardwareProtectionCircuitInvalidation(216), //
	PvDCDCDCConverterPowerCircuitInvalidation(217), //
	PvDCDCDCConverterCPUInvalidation(218), //
	PvDCDCDCConverterTINT0InterruptInvalidation(219), //
	PvDCDCDCConverterADCInterruptInvalidation(220), //
	PvDCDCDCConverterCAPITN4InterruptInvalidation(221), //
	PvDCDCDCConverterCAPINT6InterruptInvalidation(222), //
	PvDCDCDCConverterT3PINTinterruptInvalidation(223), //
	PvDCDCDCConverterT4PINTinterruptInvalidation(224), //
	PvDCDCConverterPDPINTAInterruptInvalidation(225), //
	PvDCDCConverterT1PINTInterruptInvalidationSecond(226), //
	PvDCDCConverterRESVInterruptInvalidation(227), //
	PvDCDCConverter100usTaskInvalidation(228), //
	PvDCDCConverterClockInvalidation(229), //
	PvDCDCConverterEMSMemoryInvalidation(230), //
	PvDCDCConverterExteriorCommunicationInvalidation(231), //
	PvDCDCConverterIOInterfaceInvalidation(232), //
	PvDCDCConverterInputVoltageBoundFault(233), //
	PvDCDCConverterOutterVoltageBoundFault(234), //
	PvDCDCConverterOutputVoltageBoundFault(235), //
	PvDCDCConverterInductCurrentBoundFault(236), //
	PvDCDCConverterInputCurrentBoundFault(237), //
	PvDCDCConverterOutputCurrentBoundFault(238), //
	PvDCDCDCReactorOverTemperature(239), //
	PvDCDCDCIGBTOverTemperature(240), //
	PvDCDCDCConverterChanel3OverTemperature(241), //
	PvDCDCDCConverterChanel4OverTemperature(242), //
	PvDCDCDCConverterChanel5OverTemperature(243), //
	PvDCDCDCConverterChanel6OverTemperature(244), //
	PvDCDCDCConverterChanel7OverTemperature(245), //
	PvDCDCDCConverterChanel8OverTemperature(246), //
	PvDCDCDCReactorTemperatureSamplingInvalidation(247), //
	PvDCDCDCIGBTTemperatureSamplingInvalidation(248), //
	PvDCDCDCConverterChanel3TemperatureSamplingInvalidation(249), //
	PvDCDCDCConverterChanel4TemperatureSamplingInvalidation(250), //
	PvDCDCDCConverterChanel5TemperatureSamplingInvalidation(251), //
	PvDCDCDCConverterChanel6TemperatureSamplingInvalidation(252), //
	PvDCDCDCConverterChanel7TemperatureSamplingInvalidation(253), //
	PvDCDCDCConverterChanel8TemperatureSamplingInvalidation(254), //
	PvDCDCDCConverterInductanceCurrentSamplingInvalidation(255), //
	PvDCDCCurrentSamplingInvalidationOnTheLowVoltageSideOfDCConverter(256), //
	PvDCDCVoltageSamplingInvalidationOnTheLowVoltageSideOfDCConverter(257), //
	PvDCDCInsulationInspectionFault(258), //
	PvDCDCNegContactorCloseUnsuccessly(259), //
	PvDCDCNegContactorCutWhenRunning(260), //
	PvDCDC1HighVoltageSideOfDCConverterUndervoltage(261), //
	PvDCDC1HighVoltageSideOfDCConverterOvervoltage(262), //
	PvDCDC1LowVoltageSideOfDCConverterUndervoltage(263), //
	PvDCDC1LowVoltageSideOfDCConverterOvervoltage(264), //
	PvDCDC1HighVoltageSideOfDCConverterOvercurrentFault(265), //
	PvDCDC1LowVoltageSideOfDCConverterOvercurrentFault(266), //
	PvDCDC1DCConverterIGBTFault(267), //
	PvDCDC1DCConverterPrechargeUnmet(268), //
	PvDCDC1BECUCommunicationDisconnected(269), //
	PvDCDC1DCConverterCommunicationDisconnected(270), //
	PvDCDC1CurrentConfigurationOverRange(271), //
	PvDCDC1TheBatteryRequestStop(272), //
	PvDCDC1OvercurrentRelayFault(273), //
	PvDCDC1LightningProtectionDeviceFault(274), //
	PvDCDC1DCConverterPriamaryContactorDisconnectedAbnormally(275), //
	PvDCDC1DCDisconnectedAbnormallyOnLowVoltageSideOfDCConvetor(276), //
	PvDCDC1DCConvetorEEPROMAbnormity1(277), //
	PvDCDC1DCConvetorEEPROMAbnormity1Second(278), //
	PvDCDC1EDCConvetorEEPROMAbnormity1(279), //
	PvDCDC1DCConvertorGeneralOverload(280), //
	PvDCDC1DCShortCircuit(281), //
	PvDCDC1PeakPulseCurrentProtection(282), //
	PvDCDC1DCDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(283), //
	PvDCDC1EffectivePulseValueOverhigh(284), //
	PvDCDC1DCConverteSevereOverload(285), //
	PvDCDC1DCBreakerDisconnectAbnormallyOnHighVoltageSideOfDCConvetor(286), //
	PvDCDC1DCBreakerDisconnectAbnormallyOnLowVoltageSideOfDCConvetor(287), //
	PvDCDC1DCConvetorPrechargeContactorCloseFailed(288), //
	PvDCDC1DCConvetorMainContactorCloseFailed(289), //
	PvDCDC1ACContactorStateAbnormityOfDCConvetor(290), //
	PvDCDC1DCConvetorEmergencyStop(291), //
	PvDCDC1DCConverterChargingGunDisconnected(292), //
	PvDCDC1DCCurrentAbnormityBeforeDCConvetorWork(293), //
	PvDCDC1FuSeDisconnected(294), //
	PvDCDC1DCConverterHardwareCurrentOrVoltageFault(295), //
	PvDCDC1DCConverterCrystalOscillatorCircuitInvalidation(296), //
	PvDCDC1DCConverterResetCircuitInvalidation(297), //
	PvDCDC1DCConverterSamplingCircuitInvalidation(298), //
	PvDCDC1DCConverterDigitalIOCircuitInvalidation(299), //
	PvDCDC1DCConverterPWMCircuitInvalidation(300), //
	PvDCDC1DCConverterX5045CircuitInvalidation(301), //
	PvDCDC1DCConverterCANCircuitInvalidation(302), //
	PvDCDC1DCConverterSoftwareANDHardwareProtectionCircuitInvalidation(303), //
	PvDCDC1DCConverterPowerCircuitInvalidation(304), //
	PvDCDC1DCConverterCPUInvalidation(305), //
	PvDCDC1DCConverterTINT0InterruptInvalidation(306), //
	PvDCDC1DCConverterADCInterruptInvalidation(307), //
	PvDCDC1DCConverterCAPITN4InterruptInvalidation(308), //
	PvDCDC1DCConverterCAPINT6InterruptInvalidation(309), //
	PvDCDC1DCConverterT3PINTinterruptInvalidation(310), //
	PvDCDC1DCConverterT4PINTinterruptInvalidation(311), //
	PvDCDC1DCConverterPDPINTAInterruptInvalidation(312), //
	PvDCDC1DCConverterT1PINTInterruptInvalidationSecond(313), //
	PvDCDC1DCConverterRESVInterruptInvalidation(314), //
	PvDCDC1DCConverter100usTaskInvalidation(315), //
	PvDCDC1DCConverterClockInvalidation(316), //
	PvDCDC1DCConverterEMSMemoryInvalidation(317), //
	PvDCDC1DCConverterExteriorCommunicationInvalidation(318), //
	PvDCDC1DCConverterIOInterfaceInvalidation(319), //
	PvDCDC1DCConverterInputVoltageBoundFault(320), //
	PvDCDC1DCConverterOutterVoltageBoundFault(321), //
	PvDCDC1DCConverterOutputVoltageBoundFault(322), //
	PvDCDC1DCConverterInductCurrentBoundFault(323), //
	PvDCDC1DCConverterInputCurrentBoundFault(324), //
	PvDCDC1DCConverterOutputCurrentBoundFault(325), //
	PvDCDC1DCReactorOverTemperature(326), //
	PvDCDC1DCIGBTOverTemperature(327), //
	PvDCDC1DCConverterChanel3OverTemperature(328), //
	PvDCDC1DCConverterChanel4OverTemperature(329), //
	PvDCDC1DCConverterChanel5OverTemperature(330), //
	PvDCDC1DCConverterChanel6OverTemperature(331), //
	PvDCDC1DCConverterChanel7OverTemperature(332), //
	PvDCDC1DCConverterChanel8OverTemperature(333), //
	PvDCDC1DCReactorTemperatureSamplingInvalidation(334), //
	PvDCDC1DCIGBTTemperatureSamplingInvalidation(335), //
	PvDCDC1DCConverterChanel3TemperatureSamplingInvalidation(336), //
	PvDCDC1DCConverterChanel4TemperatureSamplingInvalidation(337), //
	PvDCDC1DCConverterChanel5TemperatureSamplingInvalidation(338), //
	PvDCDC1DCConverterChanel6TemperatureSamplingInvalidation(339), //
	PvDCDC1DCConverterChanel7TemperatureSamplingInvalidation(340), //
	PvDCDC1DCConverterChanel8TemperatureSamplingInvalidation(341), //
	PvDCDC1DCConverterInductanceCurrentSamplingInvalidation(342), //
	PvDCDC1CurrentSamplingInvalidationOnTheLowVoltageSideOfDCConverter(343), //
	PvDCDC1VoltageSamplingInvalidationOnTheLowVoltageSideOfDCConverter(344), //
	PvDCDC1InsulationInspectionFault(345), //
	PvDCDC1NegContactorCloseUnsuccessly(346), //
	PvDCDC1NegContactorCutWhenRunning(347);

	private final int value;

	private FaultCharger(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}
}
