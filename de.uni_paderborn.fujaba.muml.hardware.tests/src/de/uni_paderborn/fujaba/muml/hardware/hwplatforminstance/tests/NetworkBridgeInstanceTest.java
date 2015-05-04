/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkBridgeInstance;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Bridge Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkBridgeInstance#getConnectedNetworkConnectorInstances() <em>Connected Network Connector Instances</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NetworkBridgeInstanceTest extends NetworkingHardwareInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkBridgeInstanceTest.class);
	}

	/**
	 * Constructs a new Network Bridge Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkBridgeInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Bridge Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkBridgeInstance getFixture() {
		return (NetworkBridgeInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatforminstanceFactory.eINSTANCE.createNetworkBridgeInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkBridgeInstance#getConnectedNetworkConnectorInstances() <em>Connected Network Connector Instances</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkBridgeInstance#getConnectedNetworkConnectorInstances()
	 * @generated
	 */
	public void testGetConnectedNetworkConnectorInstances() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NetworkBridgeInstanceTest