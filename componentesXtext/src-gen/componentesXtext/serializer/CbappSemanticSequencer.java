/*
 * generated by Xtext 2.33.0
 */
package componentesXtext.serializer;

import com.google.inject.Inject;
import componentes.CBAPP;
import componentes.Componente;
import componentes.ComponentesPackage;
import componentes.Conector;
import componentes.ProvidedInterface;
import componentes.RequiredInterface;
import componentesXtext.services.CbappGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class CbappSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CbappGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentesPackage.CBAPP:
				sequence_CBAPP(context, (CBAPP) semanticObject); 
				return; 
			case ComponentesPackage.COMPONENTE:
				sequence_Componente(context, (Componente) semanticObject); 
				return; 
			case ComponentesPackage.CONECTOR:
				sequence_Conector(context, (Conector) semanticObject); 
				return; 
			case ComponentesPackage.PROVIDED_INTERFACE:
				sequence_ProvidedInterface(context, (ProvidedInterface) semanticObject); 
				return; 
			case ComponentesPackage.REQUIRED_INTERFACE:
				sequence_RequiredInterface(context, (RequiredInterface) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     CBAPP returns CBAPP
	 *
	 * Constraint:
	 *     ((conectores+=Conector conectores+=Conector*)? componentes+=Componente componentes+=Componente*)
	 * </pre>
	 */
	protected void sequence_CBAPP(ISerializationContext context, CBAPP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Componente returns Componente
	 *
	 * Constraint:
	 *     (Name=EString? (provides+=ProvidedInterface provides+=ProvidedInterface*)? (requires+=RequiredInterface requires+=RequiredInterface*)?)
	 * </pre>
	 */
	protected void sequence_Componente(ISerializationContext context, Componente semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Conector returns Conector
	 *
	 * Constraint:
	 *     (nombre=EString? endA=[ProvidedInterface|EString] endB=[RequiredInterface|EString])
	 * </pre>
	 */
	protected void sequence_Conector(ISerializationContext context, Conector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProvidedInterface returns ProvidedInterface
	 *
	 * Constraint:
	 *     Name=EString?
	 * </pre>
	 */
	protected void sequence_ProvidedInterface(ISerializationContext context, ProvidedInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RequiredInterface returns RequiredInterface
	 *
	 * Constraint:
	 *     Name=EString?
	 * </pre>
	 */
	protected void sequence_RequiredInterface(ISerializationContext context, RequiredInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
