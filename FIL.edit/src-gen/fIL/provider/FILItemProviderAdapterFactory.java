/**
 */
package fIL.provider;

import fIL.util.FILAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FILItemProviderAdapterFactory extends FILAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Formation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationItemProvider formationItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormationAdapter() {
		if (formationItemProvider == null) {
			formationItemProvider = new FormationItemProvider(this);
		}

		return formationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.UE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEItemProvider ueItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUEAdapter() {
		if (ueItemProvider == null) {
			ueItemProvider = new UEItemProvider(this);
		}

		return ueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Audio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioItemProvider audioItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Audio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAudioAdapter() {
		if (audioItemProvider == null) {
			audioItemProvider = new AudioItemProvider(this);
		}

		return audioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Presentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationItemProvider presentationItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Presentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresentationAdapter() {
		if (presentationItemProvider == null) {
			presentationItemProvider = new PresentationItemProvider(this);
		}

		return presentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Faculte} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaculteItemProvider faculteItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Faculte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaculteAdapter() {
		if (faculteItemProvider == null) {
			faculteItemProvider = new FaculteItemProvider(this);
		}

		return faculteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Niveau} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauItemProvider niveauItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNiveauAdapter() {
		if (niveauItemProvider == null) {
			niveauItemProvider = new NiveauItemProvider(this);
		}

		return niveauItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Intervenant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervenantItemProvider intervenantItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervenantAdapter() {
		if (intervenantItemProvider == null) {
			intervenantItemProvider = new IntervenantItemProvider(this);
		}

		return intervenantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Documents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentsItemProvider documentsItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Documents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentsAdapter() {
		if (documentsItemProvider == null) {
			documentsItemProvider = new DocumentsItemProvider(this);
		}

		return documentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Video} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoItemProvider videoItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVideoAdapter() {
		if (videoItemProvider == null) {
			videoItemProvider = new VideoItemProvider(this);
		}

		return videoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fIL.Fichier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FichierItemProvider fichierItemProvider;

	/**
	 * This creates an adapter for a {@link fIL.Fichier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFichierAdapter() {
		if (fichierItemProvider == null) {
			fichierItemProvider = new FichierItemProvider(this);
		}

		return fichierItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (formationItemProvider != null)
			formationItemProvider.dispose();
		if (ueItemProvider != null)
			ueItemProvider.dispose();
		if (niveauItemProvider != null)
			niveauItemProvider.dispose();
		if (intervenantItemProvider != null)
			intervenantItemProvider.dispose();
		if (documentsItemProvider != null)
			documentsItemProvider.dispose();
		if (videoItemProvider != null)
			videoItemProvider.dispose();
		if (fichierItemProvider != null)
			fichierItemProvider.dispose();
		if (audioItemProvider != null)
			audioItemProvider.dispose();
		if (presentationItemProvider != null)
			presentationItemProvider.dispose();
		if (faculteItemProvider != null)
			faculteItemProvider.dispose();
	}

}
