//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  TP_BallAndBeamPlant_ZVoltage                           //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
// Description: TypeLV "ZVoltage"                      //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//

package outputVariables;

import types.MF_xfl_singleton;

public class TP_BallAndBeamPlant_ZVoltage {
	private double min = -10.0;
	private double max = 10.0;
	private double step = 0.0784313725490196;
	double _ps_NL[] = { -10.0 };
	double _pl_NL[] = {};
	double _ps_NS[] = { -5.0 };
	double _pl_NS[] = {};
	double _ps_Z[] = { 0.0 };
	double _pl_Z[] = {};
	double _ps_PS[] = { 5.0 };
	double _pl_PS[] = {};
	double _ps_PL[] = { 10.0 };
	double _pl_PL[] = {};
	public MF_xfl_singleton NL = new MF_xfl_singleton(min, max, step, _ps_NL, _pl_NL);
	public MF_xfl_singleton NS = new MF_xfl_singleton(min, max, step, _ps_NS, _pl_NS);
	public MF_xfl_singleton Z = new MF_xfl_singleton(min, max, step, _ps_Z, _pl_Z);
	public MF_xfl_singleton PS = new MF_xfl_singleton(min, max, step, _ps_PS, _pl_PS);
	public MF_xfl_singleton PL = new MF_xfl_singleton(min, max, step, _ps_PL, _pl_PL);
}