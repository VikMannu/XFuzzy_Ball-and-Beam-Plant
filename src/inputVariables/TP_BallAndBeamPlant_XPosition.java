//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  TP_BallAndBeamPlant_XPosition                           //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
// Description: TypeLV "XPosition"                      //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//

package inputVariables;

import types.MF_xfl_triangle;

public class TP_BallAndBeamPlant_XPosition {
	private double min = -0.5;
	private double max = 0.5;
	private double step = 0.00392156862745098;
	double _ps_NL[] = { -0.75, -0.5, -0.25 };
	double _pl_NL[] = {};
	double _ps_NS[] = { -0.5, -0.25, 0.0 };
	double _pl_NS[] = {};
	double _ps_Z[] = { -0.25, 0.0, 0.25 };
	double _pl_Z[] = {};
	double _ps_PS[] = { 0.0, 0.25, 0.5 };
	double _pl_PS[] = {};
	double _ps_PL[] = { 0.25, 0.5, 0.75 };
	double _pl_PL[] = {};
	public MF_xfl_triangle NL = new MF_xfl_triangle(min, max, step, _ps_NL, _pl_NL);
	public MF_xfl_triangle NS = new MF_xfl_triangle(min, max, step, _ps_NS, _pl_NS);
	public MF_xfl_triangle Z = new MF_xfl_triangle(min, max, step, _ps_Z, _pl_Z);
	public MF_xfl_triangle PS = new MF_xfl_triangle(min, max, step, _ps_PS, _pl_PS);
	public MF_xfl_triangle PL = new MF_xfl_triangle(min, max, step, _ps_PL, _pl_PL);
}
